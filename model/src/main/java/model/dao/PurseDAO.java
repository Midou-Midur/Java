package model.dao;

import model.mapgame.IMapElement;
import model.mapgame.sprite.Purse;

// TODO: Auto-generated Javadoc
/**
 * The Class PurseDAO.
 */
public class PurseDAO extends AbstractDAO {

	/**
	 * Instantiates a new purse DAO.
	 */
	public PurseDAO() {
	}

	/**
	 * Gets the element by name.
	 *
	 * @param name the name
	 * @return the element by name
	 */
	public IMapElement getElementByName(String name) {
		return new Purse();
	}
}
