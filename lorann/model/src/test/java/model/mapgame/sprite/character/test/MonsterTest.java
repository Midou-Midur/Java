package model.mapgame.sprite.character.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.mapgame.sprite.character.FBallEnum;
import model.mapgame.sprite.character.Monster;
import model.mapgame.sprite.character.MonsterNumberEnum;

public class MonsterTest {
	
	/**
	 * We want to know if getMonsterNumber equals to MonsterNumberEnum
	 */
	@Test
	public void testGetMonsterNumber() {
		Monster monster = new Monster(FBallEnum.FBALL1, MonsterNumberEnum.MONSTER1);
		assertEquals(MonsterNumberEnum.MONSTER1, monster.getMonsterNumber());
	}
}