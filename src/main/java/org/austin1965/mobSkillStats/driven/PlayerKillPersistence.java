package org.austin1965.mobSkillStats.driven;

import org.austin1965.mobSkillStats.domain.PlayerKills;

public interface PlayerKillPersistence {
  void saveKills(PlayerKills kills);

  PlayerKills getExistingKills(String mobSlayer);
}
