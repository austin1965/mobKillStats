package org.austin1965.mobKillStats.killscommand.application;

import static org.mockito.Mockito.*;

import java.util.HashMap;

import org.austin1965.mobKillStats.killscommand.driven.PlayerDisplay;
import org.austin1965.mobKillStats.dataIngest.domain.PlayerKills;
import org.austin1965.mobKillStats.dataIngest.driven.PlayerKillPersistence;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MobKillStatsDisplayServiceTest {
  @InjectMocks private MobKillStatsDisplayService classUnderTest;

  @Mock PlayerKillPersistence playerKillPersistence;

  @Mock PlayerDisplay playerDisplay;

  @Test
  public void shouldDisplayEmptyMobKillStats() {
    // given
    String playerWithNoKills = "some player";
    PlayerKills noKillRecord = new PlayerKills(playerWithNoKills, new HashMap<>());
    when(playerKillPersistence.getExistingKills(playerWithNoKills)).thenReturn(noKillRecord);

    // when
    classUnderTest.displayMobKills(playerWithNoKills);

    // then
    verify(playerDisplay, times(1)).showMobKills(noKillRecord);
  }
}
