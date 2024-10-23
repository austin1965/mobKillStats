package org.austin1965.mobKillStats.killscommand.driving;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.austin1965.mobKillStats.dummyImplementations.DummyPlayer;
import org.austin1965.mobKillStats.killscommand.application.MobKillStatsDisplayService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CommandMobKillStatsTest {

  @Mock MobKillStatsDisplayService mobKillStatsDisplayService;

  @InjectMocks CommandMobKillStats classUnderTest;

  @Test
  public void shouldForwardCommandToShowMobKillStats() {
    // given
    DummyPlayer player = new DummyPlayer();
    player.setDisplayName("some player");

    // when
    classUnderTest.onCommand(player, null, "mobKillStats", new String[] {});

    // then
    verify(mobKillStatsDisplayService, times(1)).displayMobKills("some player");
  }
}
