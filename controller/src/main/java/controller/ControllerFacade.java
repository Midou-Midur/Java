package controller;

//Key event listener
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;

import game.commons.GameConstants;
import game.commons.GameException;
import game.commons.Position;
import model.IModel;
import model.mapgame.IMapElement;
import model.mapgame.IMapGame;
import model.mapgame.sprite.ICball;
import model.mapgame.sprite.IGate;
import model.mapgame.sprite.IPurse;
import model.mapgame.sprite.character.ILorann;
import view.IView;
import view.ViewFacade;



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
	private final int level = 3;
	private boolean exit = false;
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
		this.mapGame = model.getGameByLevel(level);
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
			int sens = 2;
			final ILorann lorann = mapGame.getLorann();
			final ILorann fireball = mapGame.getLorann();
			final Position initPos = lorann.getPosition();
			final Position initPosFireball = fireball.getPosition();
			int newX = initPos.getX();
			int newY = initPos.getY();
			int newXx = initPosFireball.getX();
			int newYy = initPosFireball.getY();
			final int key = e.getKeyCode();
			switch (key) {
			case KeyEvent.VK_LEFT:
				--newX;
				sens = 3;
				break;
			case KeyEvent.VK_RIGHT:
				++newX;
				sens = 1;
				break;
			case KeyEvent.VK_UP:
				++newY;
				sens = 4;
				break;
			case KeyEvent.VK_DOWN:
				--newY;
				sens = 2;
				break;
			case KeyEvent.VK_SPACE:
				switch (sens)
				{
				case 1 :
					for(int i = 1; i<=5; i++)
					{
						mapGame.removeElement(initPosFireball);
						++newXx;
						final Position newPositionFireball = new Position(newXx, newYy);
						mapGame.addElement(newPositionFireball, lorann);
						view.drawFireball();
					}
					break;
					
				case 2 :
					break;
					
				case 3 :
					break;
					
				case 4 :
					break;
				}
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
				IMapElement element = mapGame.getElement(newPosition);
				
				if (element instanceof IPurse) {
					mapGame.removeElement(newPosition);
					
					lorann.getResult().addPurse((IPurse) element);
				}
				else if (element instanceof ICball) {
					mapGame.removeElement(newPosition);

					lorann.getResult().addCball((ICball) element);
					exit = true;
				}
				else if (element instanceof IGate) {
					if(exit == true)
					{
						System.exit(0);
					}
					else
					{
						System.out.println("u ded");
						return;
					}
				}else

					return;
			}

			mapGame.removeElement(initPos);
			mapGame.addElement(newPosition, lorann);
			view.drawLorann(sens);

		}
			
 catch (final Exception ex) {
			ex.printStackTrace();
		}
	}
	
	private void setTitle(String string) {
		// TODO Auto-generated method stub
		
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