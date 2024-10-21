package org.austin1965.mobKillStats.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;
import java.util.Map;
import org.austin1965.mobSkillStats.domain.PlayerKills;
import org.junit.jupiter.api.Test;

public class PlayerKillsTest {

  @Test
  public void shouldCountFirstKillOfNewMobForNewPlayer() {
    // given
    String mobType = "some mob";
    PlayerKills classUnderTest = new PlayerKills("some player", new HashMap<>());

    // when
    classUnderTest.countKill(mobType);

    // then
    assertThat(classUnderTest.getKills().get("some mob")).isEqualTo(1);
  }

  @Test
  public void shouldCountFirstKillOfNewMobForExistingPlayer() {
    // given
    Map<String, Integer> existingKills = new HashMap<>();
    existingKills.put("some other mob", 1);
    PlayerKills classUnderTest = new PlayerKills("some player", existingKills);
    String newMobType = "some mob";

    // when
    classUnderTest.countKill(newMobType);

    // then
    assertThat(classUnderTest.getKills().get("some other mob")).isEqualTo(1);
    assertThat(classUnderTest.getKills().get("some mob")).isEqualTo(1);
  }

  @Test
  public void shouldCountSecondKill() {
    // given
    Map<String, Integer> existingKills = new HashMap<>();
    existingKills.put("some mob", 1);
    PlayerKills classUnderTest = new PlayerKills("some player", existingKills);
    String newKill = "some mob";

    // when
    classUnderTest.countKill(newKill);

    // then
    assertThat(classUnderTest.getKills().get("some mob")).isEqualTo(2);
  }
}
