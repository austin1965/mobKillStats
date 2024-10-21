package org.austin1965.mobSkillStats.application;

import org.austin1965.mobSkillStats.domain.MobDeath;
import org.austin1965.mobSkillStats.domain.PlayerKills;
import org.austin1965.mobSkillStats.driven.PlayerKillPersistence;
import org.austin1965.mobSkillStats.driven.PlayerKillPersistenceImpl;

public class MobSlayerService {

  PlayerKillPersistence playerKillPersistence = new PlayerKillPersistenceImpl();

  public void countMobKill(MobDeath mobDeath) {
    if (mobDeath.hasNaturalCause()) {
      return;
    }
    PlayerKills kills = playerKillPersistence.getExistingKills(mobDeath.getKillerName());
    kills.countKill(mobDeath.getMobType());
    playerKillPersistence.saveKills(kills);
  }
}
