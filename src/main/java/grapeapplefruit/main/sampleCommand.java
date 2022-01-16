package grapeapplefruit.main;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class sampleCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){ // This is if the command sender is a player it will do the function.
            Player player = (Player) sender; // Defining the player/sender.

            if (player.isOp()){ // Getting if the player is op.
                player.sendMessage(ChatColor.RED + "You're an admin.");
            } else { // If player is not op then it will give them this instead.
                player.sendMessage(ChatColor.RED + "You're not an admin");
            }
        } else { // If the sender isn't a player.
            System.out.println("Please use a minecraft client.");
        }
        return false;
    }
}
