package model.dao;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import model.mapgame.IMapElement;
import model.mapgame.sprite.ICball;

public class CBallDAOTest {

	@Test
	public void testGetElementByName() {
		IMapElement cball = new CBallDAO().getElementByName("cball");
		assertTrue(cball instanceof ICball);
	}

}
