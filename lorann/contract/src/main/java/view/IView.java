package view;

import javax.swing.JPanel;

import model.mapgame.IMapGame;

/**
 * <h1>The Interface IView.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IView {
	void setMapGame(final IMapGame mapGame);

	void drawLorann();

	JPanel getGamePanel();
	
	/**
	 * Convert a model X position to x pixel coordinate of view
	 * 
	 * @param x
	 * @return
	 */
	public int convX(final int x);
	
	/**
	 * Convert a model Y position to y pixel coordinate of view
	 * 
	 * @param y
	 * @return
	 */
	public int convY(final int y);
}