package model.mapgame;

import game.commons.GameException;
import game.commons.Position;
import model.mapgame.sprite.KindOfObstacleEnum;
import model.mapgame.sprite.Obstacle;

public class MapGameFactory {

	public MapGameFactory() {
	}

	public IMapGame getLevel1() throws GameException {
		IMapGame result = new MapGame();
		result.addElement(new Position(0, 0), new Obstacle(KindOfObstacleEnum.BALL));
		return result;
	}

}
