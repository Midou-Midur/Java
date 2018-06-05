package model.dao;

import model.mapgame.IMapElement;
import model.mapgame.sprite.KindOfObstacleEnum;
import model.mapgame.sprite.Obstacle;

public class ObstacleDAO extends AbstractDAO {

	public ObstacleDAO() {
	}

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
