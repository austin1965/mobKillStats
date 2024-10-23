package org.austin1965.mobKillStats.killscommand.driven;

import org.austin1965.mobKillStats.dataIngest.domain.PlayerKills;

public interface PlayerDisplay {
  void showMobKills(PlayerKills killRecord);
}
