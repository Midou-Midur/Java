package model.dao;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import model.mapgame.IMapElement;
import model.mapgame.sprite.IGate;

public class GateDAOTest {

	@Test
	public void testGetElementByName() {
			IMapElement gate = new GateDAO().getElementByName("gate");
			assertTrue(gate instanceof IGate);
	}

}