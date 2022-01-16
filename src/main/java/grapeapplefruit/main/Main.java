package grapeapplefruit.main;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // onEnable, does what it says. It loads everything within the function.

        getCommand("checkop").setExecutor(new sampleCommand());
        getServer().getPluginManager().registerEvents(new sampleEvent(), this);
        // That's how to create your first plugin!


    }

    @Override
    public void onDisable() {
        // Does the same thing just unloads whatever's here.
    }
}
