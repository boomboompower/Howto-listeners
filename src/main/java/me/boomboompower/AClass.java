package me.boomboompower;

import org.bukkit.JavaPlugin;

public class AClass extends JavaPlugin {
    
    @Override
    public void onEnable() {
        new AListener(this);
    }
}
