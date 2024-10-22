package org.austin1965.mobSkillStats.killscommand.application;

import org.austin1965.mobSkillStats.killscommand.driven.PlayerDisplay;
import org.austin1965.mobSkillStats.killscommand.driven.PlayerDisplayChatImpl;
import org.austin1965.mobSkillStats.dataIngest.domain.PlayerKills;
import org.austin1965.mobSkillStats.dataIngest.driven.PlayerKillPersistence;
import org.austin1965.mobSkillStats.dataIngest.driven.PlayerKillPersistenceImpl;

public class MobKillDisplayService {

  PlayerKillPersistence persistence = new PlayerKillPersistenceImpl();
  PlayerDisplay display = new PlayerDisplayChatImpl();

  public void displayMobKills(String somePlayer) {
    PlayerKills kills = persistence.getExistingKills(somePlayer);
    display.showMobKills(kills);
  }
}
