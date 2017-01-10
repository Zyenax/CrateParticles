package net.CrateParticles.main.Handlers;

import net.CrateParticles.main.Main;
import net.CrateParticles.main.Utils.Packets;
import net.CrateParticles.main.Utils.Utils;
import net.minecraft.server.v1_8_R3.EnumParticle;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.event.Listener;

public class startParticles implements Listener{
	
	private static Main plugin;
	public startParticles(Main listener) {
		startParticles.plugin = listener;
		startParticleSwirl();
	}

	
	public static void startParticleSwirl(){
		Packets.createParticleHelix(new Location(Bukkit.getWorld(plugin.getConfig().getString("World")), plugin.getConfig().getDouble("Location.X"), plugin.getConfig().getDouble("Location.Y"), plugin.getConfig().getDouble("Location.Z")), 1, 2, Utils.randomNum(1, 20), EnumParticle.SPELL_WITCH);
		Packets.createParticleHelix(new Location(Bukkit.getWorld(plugin.getConfig().getString("World")), plugin.getConfig().getDouble("Location.X"), plugin.getConfig().getDouble("Location.Y") + 1, plugin.getConfig().getDouble("Location.Z")), 1, 2, Utils.randomNum(1, 20), EnumParticle.SPELL_WITCH);
		Packets.createParticleHelix(new Location(Bukkit.getWorld(plugin.getConfig().getString("World")), plugin.getConfig().getDouble("Location.X"), plugin.getConfig().getDouble("Location.Y") + 2, plugin.getConfig().getDouble("Location.Z")), 1, 2, Utils.randomNum(1, 20), EnumParticle.SPELL_WITCH);
		Packets.createParticleHelix(new Location(Bukkit.getWorld(plugin.getConfig().getString("World")), plugin.getConfig().getDouble("Location.X"), plugin.getConfig().getDouble("Location.Y") + 3, plugin.getConfig().getDouble("Location.Z")), 1, 2, Utils.randomNum(1, 20), EnumParticle.SPELL_WITCH);
		Packets.createParticleHelix(new Location(Bukkit.getWorld(plugin.getConfig().getString("World")), plugin.getConfig().getDouble("Location.X"), plugin.getConfig().getDouble("Location.Y") + 4, plugin.getConfig().getDouble("Location.Z")), 1, 2, Utils.randomNum(1, 20), EnumParticle.SPELL_WITCH);
		Packets.createParticleHelix(new Location(Bukkit.getWorld(plugin.getConfig().getString("World")), plugin.getConfig().getDouble("Location.X"), plugin.getConfig().getDouble("Location.Y"), plugin.getConfig().getDouble("Location.Z")), 1, 2, Utils.randomNum(1, 20), EnumParticle.FIREWORKS_SPARK);
		Packets.createParticleHelix(new Location(Bukkit.getWorld(plugin.getConfig().getString("World")), plugin.getConfig().getDouble("Location.X"), plugin.getConfig().getDouble("Location.Y") + 1, plugin.getConfig().getDouble("Location.Z")), 1, 2, Utils.randomNum(1, 20), EnumParticle.FIREWORKS_SPARK);
		Packets.createParticleHelix(new Location(Bukkit.getWorld(plugin.getConfig().getString("World")), plugin.getConfig().getDouble("Location.X"), plugin.getConfig().getDouble("Location.Y") + 2, plugin.getConfig().getDouble("Location.Z")), 1, 2, Utils.randomNum(1, 20), EnumParticle.FIREWORKS_SPARK);
		Packets.createParticleHelix(new Location(Bukkit.getWorld(plugin.getConfig().getString("World")), plugin.getConfig().getDouble("Location.X"), plugin.getConfig().getDouble("Location.Y") + 3, plugin.getConfig().getDouble("Location.Z")), 1, 2, Utils.randomNum(1, 20), EnumParticle.FIREWORKS_SPARK);
		Packets.createParticleHelix(new Location(Bukkit.getWorld(plugin.getConfig().getString("World")), plugin.getConfig().getDouble("Location.X"), plugin.getConfig().getDouble("Location.Y") + 4, plugin.getConfig().getDouble("Location.Z")), 1, 2, Utils.randomNum(1, 20), EnumParticle.FIREWORKS_SPARK);
	}
}
