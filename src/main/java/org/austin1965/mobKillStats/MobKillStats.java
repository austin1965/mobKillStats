package org.austin1965.mobKillStats;

import java.io.File;
import org.austin1965.mobKillStats.dataIngest.driving.EntityDeathListener;
import org.austin1965.mobKillStats.killscommand.driving.CommandMobKillStats;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class MobKillStats extends JavaPlugin {

  @Override
  public void onEnable() {
    new File("plugins\\MobKillStatsUserData").mkdirs();
    Bukkit.getPluginManager().registerEvents(new EntityDeathListener(), this);
    this.getCommand("mobkillstats").setExecutor(new CommandMobKillStats());
  }

  @Override
  public void onDisable() {
    // Plugin shutdown logic
  }
}
