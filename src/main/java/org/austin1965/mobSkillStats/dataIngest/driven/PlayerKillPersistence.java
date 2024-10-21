package org.austin1965.mobSkillStats.dataIngest.driven;

import org.austin1965.mobSkillStats.dataIngest.domain.PlayerKills;

public interface PlayerKillPersistence {
  void saveKills(PlayerKills kills);

  PlayerKills getExistingKills(String mobSlayer);
}
