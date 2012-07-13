package info.plugmania.wtf;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class wtf extends JavaPlugin {

	public boolean debug = false;

	public void onEnable(){ 
		getLogger().info("wtf is enabled.");
	}
 
	public void onDisable(){ 
		getLogger().info("wtf has been disabled.");	
	}
	
	// by the power of notch I thank korikisulda for this dirtybit
	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {
		try {
			if (args.length == 0)
				args = new String[] { "help" };

			if (args[0].equalsIgnoreCase("help")) {
				sender.sendMessage(ChatColor.DARK_GRAY
						+ "wtf version is "
						+ getDescription().getVersion());
			} else if (args[0].equalsIgnoreCase("version")) {
				sender.sendMessage(ChatColor.DARK_GRAY
						+ "wtf version is "
						+ getDescription().getVersion());
			} else {
				return false;
			}
			
		} catch (Exception e) {
			if (debug)
				e.printStackTrace();
			sender.sendMessage(ChatColor.RED + "An error occured.");
		}
		return true;
	}

}