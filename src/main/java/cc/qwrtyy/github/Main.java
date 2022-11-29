package cc.qwrtyy.github;

import cc.qwrtyy.github.handlers.ServerListPingHandler;
import org.bukkit.plugin.java.JavaPlugin;
import static pl.qwrtyy.tools.utils.listener.ListenerReg.registerListener;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        registerListeners();
    }
    public void registerListeners(){
        registerListener(this, new ServerListPingHandler());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
