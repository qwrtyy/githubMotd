/*
 * githubMotd
 * Copyright (C) 2022 qwrtyy
 */

package cc.qwrtyy.github.motd;

import cc.qwrtyy.github.motd.handlers.ServerListPingHandler;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    private final long load = System.currentTimeMillis() - System.currentTimeMillis(); //async

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("");
        Bukkit.getLogger().info("### Trwa wczytywanie pluginu na motd ###");
        Bukkit.getServer().getPluginManager().registerEvents(new ServerListPingHandler(), this);
        Bukkit.getLogger().info("     eventy zaladowano w czasie: " + load + "ms.");
        Bukkit.getLogger().info("");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
