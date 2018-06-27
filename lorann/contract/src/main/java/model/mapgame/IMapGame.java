package model.mapgame;

import game.commons.GameException;
import game.commons.Position;
import model.mapgame.sprite.character.ILorann;

public interface IMapGame {
	/**
	 * Putting an element in a specified cell which identifies by position
	 * 
	 * @param position Position of an element within map
	 * @param element Element of game(lorann, monster, purse...)
	 * @throws GameException
	 *             If Position is out of range(number of position) or Position is
	 *             busy
	 */
	void addElement(Position position, IMapElement element) throws GameException;

	/**
	 * Receiving an element in the map by Position
	 * 
	 * @param position
	 * @return
	 */
	IMapElement getElement(Position position) throws GameException;

	/**
	 * Deleting an element in the Position
	 * 
	 * @param position
	 */
	void removeElement(Position position) throws GameException;

	void setLorann(ILorann lorann);

	boolean isPositionBusy(Position position) throws GameException;

	ILorann getLorann();
}