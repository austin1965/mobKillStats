package org.austin1965.mobKillStats.dataIngest.driven;

import static org.assertj.core.api.Assertions.assertThat;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import org.apache.commons.io.FileUtils;
import org.austin1965.mobKillStats.dataIngest.domain.PlayerKills;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PlayerKillPersistenceImplTest {
  PlayerKillPersistenceImpl classUnderTest = new PlayerKillPersistenceImpl();

  @BeforeEach
  void setUp() throws IOException {
    FileUtils.cleanDirectory(new File("plugins\\MobKillStatsUserData"));
  }

  @Test
  void shouldSaveFirstKill() throws IOException {
    // given
    PlayerKills firstKill = new PlayerKills("some_player", Map.of("some mob", 1));

    // when
    classUnderTest.saveKills(firstKill);

    // then
    File mobKillFile = new File("plugins\\MobKillStatsUserData\\some_player.json");
    assertThat(mobKillFile.exists()).isTrue();

    ObjectMapper objectMapper = new ObjectMapper();
    Map<String, Integer> firstKillData = objectMapper.readValue(mobKillFile, Map.class);
    assertThat(firstKillData.get("some mob")).isEqualTo(1);
  }

  @Test
  void shouldSaveSecondKill() throws IOException {
    // given
    PlayerKills firstKill = new PlayerKills("some_player", Map.of("some mob", 1));
    classUnderTest.saveKills(firstKill);
    PlayerKills secondKill = new PlayerKills("some_player", Map.of("some mob", 2));

    // when
    classUnderTest.saveKills(secondKill);

    // then
    File mobKillFile = new File("plugins\\MobKillStatsUserData\\some_player.json");
    assertThat(mobKillFile.exists()).isTrue();

    ObjectMapper objectMapper = new ObjectMapper();
    Map<String, Integer> firstKillData = objectMapper.readValue(mobKillFile, Map.class);
    assertThat(firstKillData.get("some mob")).isEqualTo(2);
  }

  @ParameterizedTest
  @CsvSource({"some_player", "some_player2"})
  void shouldGetExistingKills(String playerName) {
    // given
    PlayerKills firstKill = new PlayerKills(playerName, Map.of("some mob", 1));
    classUnderTest.saveKills(firstKill);

    // when
    PlayerKills somePlayerKills = classUnderTest.getExistingKills(playerName);

    // then
    assertThat(somePlayerKills.getPlayerName()).isEqualTo(playerName);
    assertThat(somePlayerKills.getKills().get("some mob")).isEqualTo(1);
  }

  @Test
  void shouldProvideNewPlayerOnNewPlayerFirstKill() {
    // given
    String playerName = "some_new_player";

    // when
    PlayerKills somePlayerKills = null;
    try {
      somePlayerKills = classUnderTest.getExistingKills(playerName);

    } catch (Exception e) {
      assertThat(e).isNull();
    }

    // then
    assertThat(somePlayerKills.getPlayerName()).isEqualTo(playerName);
    assertThat(somePlayerKills.getKills().keySet().size()).isEqualTo(0);
  }
}
