/**
 * 
 */
package model.mapgame.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import game.commons.GameException;
import game.commons.Position;
import model.mapgame.IMapElement;
import model.mapgame.MapGame;
import model.mapgame.sprite.Purse;

/**
 * @author GL552VW 741698
 *
 */
public class MapGameTest {

	@Test
	public void testGetElement() {
		try {
			MapGame mapi = new MapGame();
			IMapElement element = new Purse();
			Position pos = new Position(1, 9);
			mapi.addElement(pos, element);
			assertEquals(element, mapi.getElement(pos));
		} catch (GameException e) {
			assertTrue(e.getMessage(), false);
		}
	}

}
