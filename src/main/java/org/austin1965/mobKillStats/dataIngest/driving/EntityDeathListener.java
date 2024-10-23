package org.austin1965.mobKillStats.dataIngest.driving;

import org.austin1965.mobKillStats.dataIngest.application.MobKillStatsIngestionService;
import org.austin1965.mobKillStats.dataIngest.domain.MobDeath;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class EntityDeathListener implements Listener {

  MobKillStatsIngestionService mobKillStatsIngestionService = new MobKillStatsIngestionService();

  @EventHandler
  public void onEntityDeathEvent(EntityDeathEvent event) {
    String killerName =
        event.getEntity().getKiller() != null
            ? event.getEntity().getKiller().getDisplayName()
            : null;
    String entityType = event.getEntity().getType().name();
    mobKillStatsIngestionService.countMobKill(new MobDeath(killerName, entityType));
  }
}
