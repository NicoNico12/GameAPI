package me.kangarko.gameapi.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class GameAPIPlugin extends JavaPlugin {

	/*@Override
	public void onEnable() {
		new BukkitRunnable() {

			@Override
			public void run() {
				int count = 0;
				String message = "";

				for (final ArenaPlugin pl : ArenaRegistry.getRegisteredPlugins()) {
					message += pl.getName() + ", ";

					count ++;
				}

				getServer().getLogger().info("[" + getName() + "] Successfully hooked into (" + count + "): " + message.replaceAll("\\, $", ""));
			}
		}.runTask(this);
	}*/
}