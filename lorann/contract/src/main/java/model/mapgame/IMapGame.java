package model.mapgame;

import game.commons.GameException;
import game.commons.Position;

public interface IMapGame {
	/**
	 * Putting an element in a specified cell which identifies by position
	 * @param position
	 * @param element
	 * @throws GameException If Position is out of range(number of position) 
	 * or Position is busy
	 */
	void addElement(Position position, IMapElement element) throws GameException;
	
	/**
	 * Receiving an element in the map by Position
	 * @param position
	 * @return
	 */
	IMapElement getElement (Position position);
	
	/**
	 * Deleting an element in the Postion
	 * @param position
	 */
	void removeElement(Position position);
	
}
