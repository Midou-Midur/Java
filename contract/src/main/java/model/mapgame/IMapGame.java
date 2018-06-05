package model.mapgame;

import game.commons.GameException;
import game.commons.Position;
import model.mapgame.sprite.character.ILorann;

// TODO: Auto-generated Javadoc
/**
 * The Interface IMapGame.
 */
public interface IMapGame {
	
	/**
	 * Putting an element in a specified cell which identifies by position.
	 *
	 * @param position the position
	 * @param element the element
	 * @throws GameException             If Position is out of range(number of position) or Position is
	 *             busy
	 */
	void addElement(Position position, IMapElement element) throws GameException;

	/**
	 * Receiving an element in the map by Position.
	 *
	 * @param position the position
	 * @return the element
	 * @throws GameException the game exception
	 */
	IMapElement getElement(Position position) throws GameException;

	/**
	 * Deleting an element in the Position.
	 *
	 * @param position the position
	 * @throws GameException the game exception
	 */
	void removeElement(Position position) throws GameException;

	/**
	 * Sets the lorann.
	 *
	 * @param lorann the new lorann
	 */
	void setLorann(ILorann lorann);

	/**
	 * Checks if is position busy.
	 *
	 * @param position the position
	 * @return true, if is position busy
	 * @throws GameException the game exception
	 */
	boolean isPositionBusy(Position position) throws GameException;

	/**
	 * Gets the lorann.
	 *
	 * @return the lorann
	 */
	ILorann getLorann();
}
