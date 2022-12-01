package cc.qwrtyy.github;

import cc.qwrtyy.github.handlers.ServerListPingHandler;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new ServerListPingHandler(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
