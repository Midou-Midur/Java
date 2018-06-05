package model.mapgame;

import game.commons.GameException;
import game.commons.Position;
import model.mapgame.sprite.KindOfObstacleEnum;
import model.mapgame.sprite.Obstacle;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating MapGame objects.
 */
public class MapGameFactory {

	/**
	 * Instantiates a new map game factory.
	 */
	public MapGameFactory() {
	}

	/**
	 * Gets the level 1.
	 *
	 * @return the level 1
	 * @throws GameException the game exception
	 */
	public IMapGame getLevel1() throws GameException {
		IMapGame result = new MapGame();
		result.addElement(new Position(0, 0), new Obstacle(KindOfObstacleEnum.BALL));
		return result;
	}

}
