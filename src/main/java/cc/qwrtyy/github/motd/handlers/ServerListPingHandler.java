package cc.qwrtyy.github.motd.handlers;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

public class ServerListPingHandler implements Listener {
    @EventHandler
    public void onSeverListPing(final ServerListPingEvent event) {
        event.setMotd(fixColor("&d&l◈ &dKCode&7.&fsite &8>> &7Officjalny serwer &dKCode!")
                + "\n" +
                fixColor("&d&l◈ &7To tutaj powstaly wszystkie &dprojekty!"));

    }
    @EventHandler
    public void onMaxPlayers(final ServerListPingEvent event) {
        event.setMaxPlayers(event.getNumPlayers() + 100);
    }
    public static String fixColor(final String s) {
        return ChatColor.translateAlternateColorCodes('&', s)
                .replace(">>", "»")
                .replace("<<", "«")
                .replace("((*))", "ó")
                .replace("((o))", "ó")
                .replace("<>", "✖")
                .replace("((n))", "ń")
                .replace("((l))", "ł")
                .replace("((s))", "ś")
                .replace("((a))", "ą")
                .replace("<SERCE>", "❤")
                .replace("((n))", "ń")
                .replace("((c))", "ć")
                .replace("MYSZKA", "▄")
                .replace("{PI}", "π")
                .replace("{SZP}", "→")
                .replace("{SZL}", "←")
                .replace("<X>", "✘")
                .replace("<Y>", "✔")
                .replace("{UNDERLINE}", "۔")
                .replace("{KROPKA}", "●");
    }
}
