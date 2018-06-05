package model.dao;

import model.mapgame.IMapElement;
import model.mapgame.sprite.KindOfObstacleEnum;
import model.mapgame.sprite.Obstacle;

// TODO: Auto-generated Javadoc
/**
 * The Class ObstacleDAO.
 */
public class ObstacleDAO extends AbstractDAO {

	/**
	 * Instantiates a new obstacle DAO.
	 */
	public ObstacleDAO() {
	}

	/**
	 * Gets the element by name.
	 *
	 * @param name the name
	 * @return the element by name
	 */
	public IMapElement getElementByName(String name) {

		switch (name) {
		case "vbone":
			return new Obstacle(KindOfObstacleEnum.V_BONE);

		case "hbone":
			return new Obstacle(KindOfObstacleEnum.H_BONE);

		default:
			return new Obstacle(KindOfObstacleEnum.BALL);

		}

	}
}
