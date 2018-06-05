package model.mapgame;

import game.commons.Position;

// TODO: Auto-generated Javadoc
/**
 * The Interface IMapElement.
 */
public interface IMapElement {
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	Long getId();
	
	/**
	 * Sending or setting Position.
	 *
	 * @param position the new position
	 */
	void setPosition(Position position);

	/**
	 * Gets the position.
	 *
	 * @return the position
	 */
	Position getPosition();
}
