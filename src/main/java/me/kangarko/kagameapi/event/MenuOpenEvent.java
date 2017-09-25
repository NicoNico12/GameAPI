package me.kangarko.kagameapi.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import me.kangarko.kagameapi.type.MenuType;

/**
 * Triggered when a menu is opened for a player
 */
@Getter
@RequiredArgsConstructor
public final class MenuOpenEvent extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();

	/**
	 * The menu type
	 */
	private final MenuType type;

	/**
	 * The player
	 */
	private final Player player;

	/**
	 * Should we prevent to display this menu?
	 */
	@Setter
	private boolean cancelled;

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}
}