package model.mapgame;

import javax.swing.text.Position;

import game.commons.GameException;
import game.commons.GamerException;
import game.commons.Position1;
import game.commons.Position2;

public interface IMapGame {
	/**
	 * Putting an element in a specified cell which identifies by position
	 * @param position
	 * @param element
	 * @throws GameException If Position is out of range(number of position) 
	 * or Position is busy
	 */
	void addElement(Position1 position, IMapElement element) throws GameException;
	
	/**
	 * Receiving an element in the map by Position
	 * @param position
	 * @return
	 */
	IMapElement getElement (Position1 position);
	
	/**
	 * Deleting an element in the Postion
	 * @param position
	 */
	void removeElement(Position1 position);

	void addElement(Position position, IMapElement element) throws GameException;

	void removeElement(Position position);

	IMapElement getElement(Position1 position, Position2 position2) throws GamerException, GameException;
	
}
