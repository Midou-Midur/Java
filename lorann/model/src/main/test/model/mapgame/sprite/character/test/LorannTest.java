package model.mapgame.sprite.character.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import model.mapgame.sprite.character.FBallEnum;
import model.mapgame.sprite.character.Lorann;

public class LorannTest {

	@Test
	public void testGetFBall() {
		Lorann lorann = new Lorann(FBallEnum.FBALLORANN);
		assertEquals(FBallEnum.FBALLORANN, lorann.getFBall());
		lorann.setFBall(FBallEnum.FBALL1);
		assertEquals(FBallEnum.FBALL1, lorann.getFBall());
	}

	@Test
	public void testIsAlive() {
		Lorann lorann = new Lorann(FBallEnum.FBALLORANN);
		assertTrue(lorann.isAlive());
		lorann.setFBall(null);
		assertFalse(lorann.isAlive());
	}

	@Test
	public void testGetPosition() {
		Lorann lorann = new Lorann(FBallEnum.FBALLORANN);
		assertEquals(FBallEnum.FBALLORANN, lorann.getPosition());
		lorann.setPosition();
		assertEquals(FBallEnum.FBALL1, lorann.getPosition());
	}
}