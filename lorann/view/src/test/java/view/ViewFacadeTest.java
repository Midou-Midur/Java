package view;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import game.commons.GameConstants;

public class ViewFacadeTest {

	private IView view;
	
	@Before
	public void setUp() {
		view = new ViewFacade();
	}
	
	/**
	 * Test if GamePanel exists
	 */
	@Test
	public void testGetGamePanel() {
		assertNotNull(view.getGamePanel());
	}

	/**
	 * Test if convX is eguals to result value
	 */
	@Test
	public void testConvX() {
		assertEquals(3 * GameConstants.SPRITE_WIDTH, view.convX(3));
	}

	/**
	 * Test if convY is eguals to result value
	 */
	@Test
	public void testConvY() {
		assertEquals((GameConstants.MAX_GAME_ROWS - 3 - 1) * GameConstants.SPRITE_HEIGHT, view.convY(3));
	}

}