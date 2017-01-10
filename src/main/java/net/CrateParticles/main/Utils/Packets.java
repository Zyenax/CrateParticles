package net.CrateParticles.main.Utils;

import net.CrateParticles.main.Main;
import net.minecraft.server.v1_8_R3.EnumParticle;
import net.minecraft.server.v1_8_R3.PacketPlayOutWorldParticles;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class Packets implements Listener{
	
	private static Main plugin;
	public Packets(Main listener) {
		Packets.plugin = listener;
	}
	
	public static void createParticleHelix(final Location loc, final Integer MaxHeight, final Integer radius, final Integer rotation, final EnumParticle particletype) {
		Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable(){
			double y = 0;
			double rotSpeed;
    		public void run() {
		if(rotSpeed > 20){
			rotSpeed=0;
		}
			rotSpeed = rotSpeed + 0.07;
	        double x = radius * Math.cos(rotSpeed + rotation);
	        double z = radius * Math.sin(rotSpeed + rotation);
	        PacketPlayOutWorldParticles packet = new PacketPlayOutWorldParticles(particletype, true, (float) (loc.getX() + x), (float) (loc.getY() + y), (float) (loc.getZ() + z), 0, 0, 0, 0, 1, null);
	        for(Player online : Bukkit.getOnlinePlayers()) {
	            ((CraftPlayer)online).getHandle().playerConnection.sendPacket(packet);
	        }
    		}
		}, 0, 1);
	}

}
