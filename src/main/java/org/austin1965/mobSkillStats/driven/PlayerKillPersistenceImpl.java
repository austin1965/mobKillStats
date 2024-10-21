package org.austin1965.mobSkillStats.driven;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.austin1965.mobSkillStats.domain.PlayerKills;

public class PlayerKillPersistenceImpl implements PlayerKillPersistence {
  public void saveKills(PlayerKills kills) {
    ObjectMapper objectMapper = new ObjectMapper();
    try {
      String playerFile =
          String.format("plugins\\MobKillStatsUserData\\%s.json", kills.getPlayerName());
      objectMapper.writeValue(new File(playerFile), kills.getKills());

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public PlayerKills getExistingKills(String mobSlayer) {
    String playerFile = String.format("plugins\\MobKillStatsUserData\\%s.json", mobSlayer);
    ObjectMapper objectMapper = new ObjectMapper();

    Map<String, Integer> mobKills;
    try {
      mobKills = objectMapper.readValue(new File(playerFile), Map.class);
    } catch (IOException e) {
      return new PlayerKills(mobSlayer, new HashMap<>());
    }

    return new PlayerKills(mobSlayer, mobKills);
  }
}
