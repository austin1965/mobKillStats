package org.austin1965.mobSkillStats.driving;

import org.austin1965.mobSkillStats.application.MobSlayerService;
import org.austin1965.mobSkillStats.domain.MobDeath;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class EntityDeathListener implements Listener {

  MobSlayerService mobSlayerService = new MobSlayerService();

  @EventHandler
  public void onEntityDeathEvent(EntityDeathEvent event) {
    String killerName =
        event.getEntity().getKiller() != null
            ? event.getEntity().getKiller().getDisplayName()
            : null;
    String entityType = event.getEntity().getType().name();
    mobSlayerService.countMobKill(new MobDeath(killerName, entityType));
  }
}
