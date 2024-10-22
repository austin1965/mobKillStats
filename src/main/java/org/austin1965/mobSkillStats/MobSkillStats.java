package org.austin1965.mobSkillStats;

import java.io.File;
import org.austin1965.mobSkillStats.dataIngest.driving.EntityDeathListener;
import org.austin1965.mobSkillStats.killscommand.driving.CommandMobKillStats;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class MobSkillStats extends JavaPlugin {

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
