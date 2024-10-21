package org.austin1965.mobSkillStats.dataIngest.application;

import org.austin1965.mobSkillStats.dataIngest.domain.MobDeath;
import org.austin1965.mobSkillStats.dataIngest.domain.PlayerKills;
import org.austin1965.mobSkillStats.dataIngest.driven.PlayerKillPersistence;
import org.austin1965.mobSkillStats.dataIngest.driven.PlayerKillPersistenceImpl;

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
