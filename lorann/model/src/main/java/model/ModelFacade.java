package model;

import java.sql.SQLException;

import game.commons.GameException;
import model.dao.MapGameDAO;
import model.mapgame.IMapGame;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public final class ModelFacade implements IModel {

	/**
	 * Instantiates a new model facade.
	 */
	public ModelFacade() {
		super();
	}

	@Override
	public IMapGame getGameByLevel(int level) throws SQLException, GameException {
		return new MapGameDAO().getGameByLevel(level);
	}
}
