package org.austin1965.mobKillStats.dataIngest.driven;

import org.austin1965.mobKillStats.dataIngest.domain.PlayerKills;

public interface PlayerKillPersistence {
  void saveKills(PlayerKills kills);

  PlayerKills getExistingKills(String mobSlayer);
}
