package org.austin1965.mobSkillStats.killscommand.driven;

import org.austin1965.mobSkillStats.dataIngest.domain.PlayerKills;

public interface PlayerDisplay {
  void showMobKills(PlayerKills killRecord);
}
