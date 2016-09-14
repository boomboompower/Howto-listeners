package me.boomboompower;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by ThePowerSquad on 22-Apr-16.
 */
public class AClass extends JavaPlugin 
    {

    @Override
    public void onEnable() 
    {
        new AListener(this);
    }
}
