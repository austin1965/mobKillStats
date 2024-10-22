package org.austin1965.mobKillStats;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.austin1965.mobKillStats.dummyImplementations.DummyPlayer;
import org.austin1965.mobSkillStats.CommandMobKillStats;
import org.austin1965.mobSkillStats.MobKillDisplayService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CommandMobKillStatsTest {

  @Mock MobKillDisplayService mobKillDisplayService;

  @InjectMocks CommandMobKillStats classUnderTest;

  @Test
  public void shouldForwardCommandToShowMobKillStats() {
    // given
    DummyPlayer player = new DummyPlayer();
    player.setDisplayName("some player");

    // when
    classUnderTest.onCommand(player, null, "mobKillStats", new String[] {});

    // then
    verify(mobKillDisplayService, times(1)).displayMobKills("some player");
  }
}
