package model.mapgame.sprite.character.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.mapgame.sprite.Purse;
import model.mapgame.sprite.character.Result;

public class ResultTest {

	@Test
	public void testGetPurse() {
		Result result = new Result();
		assertEquals(0,result.getPurse());
	}

	@Test
	public void testAddPurse() {
		Result result = new Result();
		result.addPurse(new Purse());
		assertEquals(1, result.getPurse());
	}
}