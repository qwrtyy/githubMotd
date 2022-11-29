package cc.qwrtyy.github.handlers;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;
import pl.qwrtyy.tools.utils.Utils;

public class ServerListPingHandler implements Listener {
    @EventHandler
    public void onSeverListPing(final ServerListPingEvent event) {
        event.setMotd(Utils.fixColor("&d&l◈ &dKCode&7.&fsite &8>> &7Officjalny serwer &dKCode!")
                + "\n" +
                Utils.fixColor("&d&l◈ &7To tutaj powstaly wszystkie &dprojekty!"));

    }
    @EventHandler
    public void onMaxPlayers(final ServerListPingEvent event) {
        event.setMaxPlayers(event.getNumPlayers() + 69);
    }
}
