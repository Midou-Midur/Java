package model.dao;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import model.mapgame.IMapElement;
import model.mapgame.sprite.IPurse;

public class PurseDAOTest {

	@Test
	public void testGetElementByName() {
		IMapElement purse = new PurseDAO().getElementByName("purse");
		assertTrue(purse instanceof IPurse);
	}

}
