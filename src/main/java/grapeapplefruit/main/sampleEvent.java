package grapeapplefruit.main;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class sampleEvent implements Listener {
    @EventHandler
    public void playerOp(PlayerDeathEvent event){
        Player player = (Player) event.getEntity();
        // This is a lot like the sampleCommand class just using an event.
        if (player.isOp()){
            player.setHealth(20);
            player.sendMessage("You've been saved.");
        } else {
            player.setHealth(0);
            player.sendMessage("That's unfortunate.");
        }
    }
}
