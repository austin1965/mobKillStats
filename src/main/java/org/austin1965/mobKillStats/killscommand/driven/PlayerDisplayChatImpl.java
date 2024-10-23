package org.austin1965.mobKillStats.killscommand.driven;

import java.util.Map;
import org.austin1965.mobKillStats.dataIngest.domain.PlayerKills;
import org.bukkit.Bukkit;

public class PlayerDisplayChatImpl implements PlayerDisplay {

  @Override
  public void showMobKills(PlayerKills killRecord) {
    Map<String, Integer> kills = killRecord.getKills();
    if (kills.keySet().isEmpty()) {
      Bukkit.getPlayer(killRecord.getPlayerName()).sendMessage("You don't have any kills");
      return;
    }

    for (Map.Entry<String, Integer> entry : kills.entrySet()) {
      Bukkit.getPlayer(killRecord.getPlayerName())
          .sendMessage(entry.getKey() + ": " + entry.getValue());
    }
  }
}
