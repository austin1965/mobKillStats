package org.austin1965.mobSkillStats;

import org.austin1965.mobSkillStats.dataIngest.domain.PlayerKills;

public interface PlayerDisplay {
  void showMobKills(PlayerKills killRecord);
}
