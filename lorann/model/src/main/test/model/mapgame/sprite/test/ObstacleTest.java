package model.mapgame.sprite.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.mapgame.sprite.KindOfObstacleEnum;
import model.mapgame.sprite.Obstacle;

public class ObstacleTest {

	@Test
	public void testGetKindOfObstacle() {
		Obstacle ob = new Obstacle(KindOfObstacleEnum.V_BONE);
		assertEquals(KindOfObstacleEnum.V_BONE, ob.getKindOfObstacle());
	}

}
