package model;

import java.sql.SQLException;

import game.commons.GameException;
import model.mapgame.IMapGame;

/**
 * <h1>The Interface IModel.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IModel {

	/**
	 * Gets the game by level.
	 *
	 * @param level
	 * @return the game by level.
	 * @throws SQLException
	 *             the SQL exception
	 */
	IMapGame getGameByLevel(int level) throws SQLException, GameException;
}
