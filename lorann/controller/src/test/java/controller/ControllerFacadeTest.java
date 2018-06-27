package controller;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import javax.swing.JPanel;

import org.junit.Before;
import org.junit.Test;

import game.commons.GameException;
import model.IModel;
import model.mapgame.IMapGame;
import view.IView;

public class ControllerFacadeTest {

	private IController controller;
	private IModel model;
	private IView view;

	@Before
	public void setUp() throws Exception {
		model = new IModel() {

			@Override
			public IMapGame getGameByLevel(int level) throws SQLException, GameException {
				return null;
			}
		};
		view = new IView() {

			@Override
			public void setMapGame(IMapGame mapGame) {
			}

			@Override
			public JPanel getGamePanel() {
				return null;
			}

			@Override
			public void drawLorann() {
			}

			@Override
			public int convY(int y) {
				return 0;
			}

			@Override
			public int convX(int x) {
				return 0;
			}
		};
		controller = new ControllerFacade(view, model);
	}

	/**
	 * Test if the view of controller is the same of the view resulted
	 */
	@Test
	public void testGetView() {
		assertEquals(view, controller.getView());
	}

	/**
	 * Test if the model of controller is the same of the model resulted
	 */
	@Test
	public void testGetModel() {
		assertEquals(model, controller.getModel());
	}
}