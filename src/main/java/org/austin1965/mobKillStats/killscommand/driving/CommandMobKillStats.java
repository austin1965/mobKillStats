package org.austin1965.mobKillStats.killscommand.driving;

import org.austin1965.mobKillStats.killscommand.application.MobKillStatsDisplayService;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandMobKillStats implements CommandExecutor {
  MobKillStatsDisplayService mobKillStatsDisplayService = new MobKillStatsDisplayService();

  @Override
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    if (sender instanceof Player) {
      Player player = (Player) sender;
      mobKillStatsDisplayService.displayMobKills(player.getDisplayName());
    }
    return true;
  }
}
