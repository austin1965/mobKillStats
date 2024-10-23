package org.austin1965.mobKillStats.dataIngest.application;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

import java.util.HashMap;
import java.util.Map;
import org.austin1965.mobKillStats.dataIngest.domain.MobDeath;
import org.austin1965.mobKillStats.dataIngest.domain.PlayerKills;
import org.austin1965.mobKillStats.dataIngest.driven.PlayerKillPersistence;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MobKillStatsIngestionServiceTest {
  @InjectMocks MobKillStatsIngestionService classUnderTest;

  @Mock PlayerKillPersistence playerKillPersistence;

  @Test
  public void shouldCountFirstKill() {
    // given
    MobDeath firstKill = new MobDeath("some player", "some mob");
    PlayerKills playerKills = new PlayerKills("some player", Map.of("some mob", 1));
    PlayerKills existingPlayerKills = new PlayerKills("some player", new HashMap<>());
    when(playerKillPersistence.getExistingKills(eq("some player"))).thenReturn(existingPlayerKills);

    // when
    classUnderTest.countMobKill(firstKill);

    // then
    verify(playerKillPersistence, times(1)).saveKills(eq(playerKills));
  }

  @Test
  public void shouldCountSecondKill() {
    // given
    MobDeath secondKill = new MobDeath("some player", "some mob");
    PlayerKills existingPlayerKills =
        new PlayerKills(
            "some player",
            new HashMap<>() {
              {
                put("some mob", 1);
              }
            });
    when(playerKillPersistence.getExistingKills(eq("some player"))).thenReturn(existingPlayerKills);
    PlayerKills updatedPlayerKills = new PlayerKills("some player", Map.of("some mob", 2));

    // when
    classUnderTest.countMobKill(secondKill);

    // then
    verify(playerKillPersistence, times(1)).saveKills(eq(updatedPlayerKills));
  }

  @Test
  public void shouldNotCountDeathFromNaturalCauses() {
    // given
    MobDeath mobDeathNotFromPlayer = new MobDeath(null, "some mob");

    // when
    classUnderTest.countMobKill(mobDeathNotFromPlayer);

    // then
    verify(playerKillPersistence, never()).getExistingKills(any());
    verify(playerKillPersistence, never()).saveKills(any());
  }
}
