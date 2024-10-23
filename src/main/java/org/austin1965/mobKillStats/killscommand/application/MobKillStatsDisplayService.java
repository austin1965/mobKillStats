package org.austin1965.mobKillStats.killscommand.application;

import org.austin1965.mobKillStats.killscommand.driven.PlayerDisplay;
import org.austin1965.mobKillStats.killscommand.driven.PlayerDisplayChatImpl;
import org.austin1965.mobKillStats.dataIngest.domain.PlayerKills;
import org.austin1965.mobKillStats.dataIngest.driven.PlayerKillPersistence;
import org.austin1965.mobKillStats.dataIngest.driven.PlayerKillPersistenceImpl;

public class MobKillStatsDisplayService {

  PlayerKillPersistence persistence = new PlayerKillPersistenceImpl();
  PlayerDisplay display = new PlayerDisplayChatImpl();

  public void displayMobKills(String somePlayer) {
    PlayerKills kills = persistence.getExistingKills(somePlayer);
    display.showMobKills(kills);
  }
}
