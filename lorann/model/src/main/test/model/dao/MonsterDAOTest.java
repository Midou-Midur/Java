package model.dao;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import model.mapgame.IMapElement;
import model.mapgame.sprite.character.IMonster;

public class MonsterDAOTest {

	@Test
	public void testGetElementByName() {
		IMapElement monster = new MonsterDAO().getElementByName("monster_1");
		assertTrue(monster instanceof IMonster);
		}
}
