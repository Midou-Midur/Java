package model.mapgame;

import javax.swing.text.Position;

import game.commons.Position1;

public interface IMapElement {
	
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
