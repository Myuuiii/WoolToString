package moe.myuuiii.wooltostring;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class WoolToString extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.addRecipe(new WoolToStringRecipe(this));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
