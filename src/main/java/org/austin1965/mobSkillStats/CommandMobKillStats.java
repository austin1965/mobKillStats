package org.austin1965.mobSkillStats;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandMobKillStats implements CommandExecutor {
  MobKillDisplayService mobKillDisplayService = new MobKillDisplayService();

  @Override
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    if (sender instanceof Player) {
      Player player = (Player) sender;
      mobKillDisplayService.displayMobKills(player.getDisplayName());
    }
    return true;
  }
}
