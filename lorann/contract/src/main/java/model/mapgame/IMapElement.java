package model.mapgame;

import game.commons.Position;

public interface IMapElement {
	
	Long getId();
	
	/**
	 * Sending or setting Position
	 * @param position
	 */
	void setPosition(Position position);
	
	/**
	 * Receiving the Position
	 * @return
	 */
	Position getPosition();
}
