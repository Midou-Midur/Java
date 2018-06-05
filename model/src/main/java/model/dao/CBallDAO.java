package model.dao;

import model.mapgame.IMapElement;
import model.mapgame.sprite.Cball;

// TODO: Auto-generated Javadoc
/**
 * The Class CBallDAO.
 */
public class CBallDAO extends AbstractDAO {

	/**
	 * Instantiates a new c ball DAO.
	 */
	public CBallDAO() {
	}

	/**
	 * Gets the element by name.
	 *
	 * @param name the name
	 * @return the element by name
	 */
	public IMapElement getElementByName(String name) {
		return new Cball();
	}
}
