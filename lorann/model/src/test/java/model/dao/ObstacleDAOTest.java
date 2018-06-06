package model.dao;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import model.mapgame.IMapElement;
import model.mapgame.sprite.IObstacle;

public class ObstacleDAOTest {

	@Test
	public void testGetElementByName() {
		IMapElement v_bone = new ObstacleDAO().getElementByName("v_bone");
		assertTrue(v_bone instanceof IObstacle);
	}

}
