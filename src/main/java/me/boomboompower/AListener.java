package me.boomboompower;

import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class AListener implements Listener {

    private AClass aClass;
    public AListener(AClass aClass) {
        this.aClass = aClass;
        Bukkit.getPluginManager().registerEvents(this, aClass);
    }

    @EventHandler
    private void onPlayerJoin(PlayerJoinEvent e) {
        e.setJoinMessage(ChatColor.GREEN + "+ " + ChatColor.DARK_GREEN + e.getPlayer().getName());
    }
}
