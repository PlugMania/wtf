package info.plugmania.wtf;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.CommandExecutor;

public class wtfCommandExecutor implements CommandExecutor {
 
	private wtf plugin;
 
	public wtfCommandExecutor(wtf plugin) {
		this.plugin = plugin;
	}
 
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		// ... implementation exactly as before ...
	}
}