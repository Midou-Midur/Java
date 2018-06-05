package model.dao;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import model.mapgame.IMapElement;
import model.mapgame.sprite.character.ILorann;

public class LorannDAOTest {

	@Test
	public void testGetElementByName() {
		IMapElement lorann = new LorannDAO().getElementByName("lorann");
		assertTrue(lorann instanceof ILorann);
	}
}