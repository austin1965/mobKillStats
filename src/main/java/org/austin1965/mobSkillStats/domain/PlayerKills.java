package org.austin1965.mobSkillStats.domain;

import java.util.Map;
import java.util.Objects;

public class PlayerKills {
  private String playerName;
  private Map<String, Integer> kills;

  public PlayerKills(String playerName, Map<String, Integer> kills) {
    this.playerName = playerName;
    this.kills = kills;
  }

  public String getPlayerName() {
    return playerName;
  }

  public Map<String, Integer> getKills() {
    return kills;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PlayerKills that = (PlayerKills) o;
    return Objects.equals(playerName, that.playerName) && Objects.equals(kills, that.kills);
  }

  public void countKill(String mobType) {
    this.getKills()
        .compute(
            mobType,
            (k, existingKillCount) -> existingKillCount != null ? existingKillCount + 1 : 1);
  }
}
