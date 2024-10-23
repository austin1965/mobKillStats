package org.austin1965.mobKillStats.dataIngest.application;

import org.austin1965.mobKillStats.dataIngest.domain.MobDeath;
import org.austin1965.mobKillStats.dataIngest.domain.PlayerKills;
import org.austin1965.mobKillStats.dataIngest.driven.PlayerKillPersistence;
import org.austin1965.mobKillStats.dataIngest.driven.PlayerKillPersistenceImpl;

public class MobKillStatsIngestionService {

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
