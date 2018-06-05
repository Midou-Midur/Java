package model;

import java.sql.SQLException;
import java.util.List;

import game.commons.GameException;
import model.dao.MapGameDAO;
import model.mapgame.IMapGame;

// TODO: Auto-generated Javadoc
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

	/* (non-Javadoc)
	 * @see model.IModel#getGameByLevel(int)
	 */
	@Override
	public IMapGame getGameByLevel(int level) throws SQLException, GameException {
		return new MapGameDAO().getGameByLevel(level);
	}

	/* (non-Javadoc)
	 * @see model.IModel#getExampleById(int)
	 */
	@Override
	public Example getExampleById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}


	/* (non-Javadoc)
	 * @see model.IModel#getExampleByName(java.lang.String)
	 */
	@Override
	public Example getExampleByName(String name) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see model.IModel#getAllExamples()
	 */
	@Override
	public List<Example> getAllExamples() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
}
