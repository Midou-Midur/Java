package model.dao;

import model.mapgame.IMapElement;
import model.mapgame.sprite.character.FBallEnum;
import model.mapgame.sprite.character.Lorann;

// TODO: Auto-generated Javadoc
/**
 * The Class LorannDAO.
 */
public class LorannDAO extends AbstractDAO {

	/**
	 * Instantiates a new lorann DAO.
	 */
	public LorannDAO() {
	}

	/**
	 * Gets the element by name.
	 *
	 * @param name the name
	 * @return the element by name
	 */
	public IMapElement getElementByName(String name) {
		return new Lorann(FBallEnum.FBALLORANN);
	}
}
