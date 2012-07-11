package info.plugmania.PlugMania.wtf;

import org.bukkit.plugin.java.JavaPlugin;


public class wtf extends JavaPlugin {

	public void onEnable(){ 
		getLogger().info("wtf is enabled.");
	}
 
	public void onDisable(){ 
		getLogger().info("wtf has been disabled.");
	}

}