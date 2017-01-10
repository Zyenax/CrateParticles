package net.CrateParticles.main;

import net.CrateParticles.main.Handlers.startParticles;
import net.CrateParticles.main.Utils.Packets;
import net.CrateParticles.main.Utils.Utils;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{

	public void onEnable(){
		saveConfig();
		ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
		if (!getConfig().contains("World")) {
			console.sendMessage(Utils.color("&8&l[&e&lCrateParticles&8&l] &aWORLD ADDED TO CONFIG!"));
			getConfig().set("World", "world");
        }
		if (!getConfig().contains("Location")) {
			console.sendMessage(Utils.color("&8&l[&e&lCrateParticles&8&l] &aLOCATION ADDED TO CONFIG!"));
			getConfig().set("Location.X", 0.5);
			getConfig().set("Location.Y", 5.5);
			getConfig().set("Location.Z", 0.5);
        }
		saveConfig();
		Listeners();
        console.sendMessage(Utils.color("&8&l[&e&lCrateParticles&8&l] &aHas been enabled!"));
	}
	
	public void onDisable(){
		ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
        console.sendMessage(Utils.color("&8&l[&e&lCrateParticles&8&l] &cHas been disabled!"));
	}
	
	public void Listeners(){
		PluginManager pm = Bukkit.getServer().getPluginManager();
		pm.registerEvents(new Packets(this), this);
		pm.registerEvents(new Utils(this), this);
		pm.registerEvents(new startParticles(this), this);
	}
	
}
