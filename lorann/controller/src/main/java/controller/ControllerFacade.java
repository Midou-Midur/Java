package controller;

//Test

//Key event listener
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;

import game.commons.GameConstants;
import game.commons.GameException;
import game.commons.Position;
import model.IModel;
import model.mapgame.IMapGame;
import model.mapgame.sprite.character.ILorann;
import view.IView;

/**
 * <h1>The Class ControllerFacade provides a facade of the Controller
 * component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ControllerFacade implements IController, KeyListener {

	/** The view. */
	private final IView view;

	/** The model. */
	private final IModel model;
	private final IMapGame mapGame;

	/**
	 * Instantiates a new controller facade.
	 *
	 * @param view
	 *            the view
	 * @param model
	 *            the model
	 * @throws GameException
	 * @throws SQLException
	 */
	public ControllerFacade(final IView view, final IModel model) throws SQLException, GameException {
		super();
		this.view = view;
		this.model = model;
		this.mapGame = model.getGameByLevel(1);
		this.view.setMapGame(mapGame);
	}

	/**
	 * Start.
	 *
	 * @throws SQLException
	 *             the SQL exception
	 */
	public void start() throws SQLException {
		this.view.getGamePanel().addKeyListener(this);
	}

	// Getters
	/**
	 * Gets the view.
	 *
	 * @return the view
	 */
	public IView getView() {
		return this.view;
	}

	/**
	 * Gets the model.
	 *
	 * @return the model
	 */
	public IModel getModel() {
		return this.model;
	}

	// Key listeners
	/*
	 * (non-Javadoc)s
	 * 
	 * @see com.game.controller.ITest#keyTyped(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyTyped(final KeyEvent e) {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.game.controller.ITest#keyPressed(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyPressed(final KeyEvent e) {
		try {
			final ILorann lorann = mapGame.getLorann();
			final Position initPos = lorann.getPosition();
			int newX = initPos.getX();
			int newY = initPos.getY();
			final int key = e.getKeyCode();
			switch (key) {
			case KeyEvent.VK_LEFT:
				--newX;
				break;
			case KeyEvent.VK_RIGHT:
				++newX;
				break;
			case KeyEvent.VK_UP:
				++newY;
				break;
			case KeyEvent.VK_DOWN:
				--newY;
				break;
			}
			if (newX < 0 || GameConstants.MAX_GAME_COLUMNS <= newX) {
				return;
			}
			if (newY < 0 || GameConstants.MAX_GAME_ROWS <= newY) {
				return;
			}
			final Position newPosition = new Position(newX, newY);
			if (mapGame.isPositionBusy(newPosition)) {
				return;
			}
			mapGame.removeElement(initPos);
			mapGame.addElement(newPosition, lorann);
			view.drawLorann();
		} catch (final Exception ex) {
			ex.printStackTrace();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.game.controller.ITest#keyReleased(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyReleased(final KeyEvent e) {
	}
}