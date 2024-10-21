package org.austin1965.mobSkillStats;

import java.io.File;
import org.austin1965.mobSkillStats.driving.EntityDeathListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class MobSkillStats extends JavaPlugin {

  @Override
  public void onEnable() {
    new File("plugins\\MobKillStatsUserData").mkdirs();
    Bukkit.getPluginManager().registerEvents(new EntityDeathListener(), this);
  }

  @Override
  public void onDisable() {
    // Plugin shutdown logic
  }
}
