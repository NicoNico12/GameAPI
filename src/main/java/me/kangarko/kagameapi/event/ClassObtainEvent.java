package me.kangarko.kagameapi.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import me.kangarko.kagameapi.ArenaClass;

/**
 * Triggered before the a player attempts to receive a class.
 */
@Getter
@RequiredArgsConstructor
public final class ClassObtainEvent extends Event {

	private static final HandlerList handlers = new HandlerList();

	/**
	 * The player
	 */
	private final Player player;

	/**
	 * The class
	 */
	private final ArenaClass arenaClass;

	/**
	 * The tier
	 */
	private final int tier;

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}
}