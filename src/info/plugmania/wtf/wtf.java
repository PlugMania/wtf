package info.plugmania.wtf;

import org.bukkit.plugin.java.JavaPlugin;


public class wtf extends JavaPlugin {

	private wtfCommandExecutor myExecutor;
	@Override
	public void onEnable(){ 
		getLogger().info("wtf is enabled.");
		myExecutor = new wtfCommandExecutor(this);
		getCommand("wtf").setExecutor(myExecutor);
	}
 
	public void onDisable(){ 
		getLogger().info("wtf has been disabled.");	
	}

}