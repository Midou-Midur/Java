package view;


import java.awt.Graphics;

import javax.swing.JPanel;

import game.commons.GameException;
import game.commons.Position;
import model.mapgame.IMapGame;


// TODO: Auto-generated Javadoc
/**
 * <h1>The Interface IView.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IView {


	/**
	 * Sets the map game.
	 *
	 * @param mapGame the new map game
	 */
	void setMapGame(final IMapGame mapGame);


	/**
	 * Gets the game panel.
	 *
	 * @return the game panel
	 */
	JPanel getGamePanel();

	/**
	 * Draw lorann.
	 *
	 * @param pos the pos
	 * @throws GameException 
	 */
	void drawLorann(int pos) throws GameException;



	void paint(Graphics g);

	void drawFireball() throws GameException;


}
