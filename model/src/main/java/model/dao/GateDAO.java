package model.dao;

import model.mapgame.IMapElement;
import model.mapgame.sprite.Gate;

// TODO: Auto-generated Javadoc
/**
 * The Class GateDAO.
 */
public class GateDAO extends AbstractDAO {

	/**
	 * Instantiates a new gate DAO.
	 */
	public GateDAO() {
	}

	/**
	 * Gets the element by name.
	 *
	 * @param name the name
	 * @return the element by name
	 */
	public IMapElement getElementByName(String name) {
		return new Gate();
	}

}
