package model.mapgame;


import game.commons.GameConstants;
import game.commons.GameException;
import game.commons.Position;
import model.mapgame.sprite.character.ILorann;

import model.mapgame.IMapElement;
import model.mapgame.IMapGame;


// TODO: Auto-generated Javadoc
/**
 * The Class MapGame.
 */
public class MapGame implements IMapGame {

	/** The elements. */
	private final IMapElement[][] elements = new IMapElement[GameConstants.MAX_GAME_ROWS][GameConstants.MAX_GAME_COLUMNS];
	
	/** The lorann. */
	private ILorann lorann;

	/* (non-Javadoc)
	 * @see model.mapgame.IMapGame#addElement(game.commons.Position, model.mapgame.IMapElement)
	 */
	@Override
	public void addElement(Position position, IMapElement element) throws GameException {
		checkPosition(position);
		if (elements[(position).getY()][(position).getX()] != null) {
			throw new GameException("Position (" + (position).getX() + ", " + (position).getY() + ") is busy");
		}
		// An element has a the position by axes x/y
		elements[(position).getY()][(position).getX()] = element;
		// Position of an element adding in the table of position
		element.setPosition(position);
	}

	/* (non-Javadoc)
	 * @see model.mapgame.IMapGame#getElement(game.commons.Position)
	 */
	@Override
	public IMapElement getElement(Position position) throws GameException {

		checkPosition(position);

		return elements[position.getY()][position.getX()];
	}

	/**
	 * Check position.
	 *
	 * @param position the position
	 * @throws GameException the game exception
	 */
	protected void checkPosition(Position position) throws GameException {
		if (position.getX() < 0 || position.getX() >= GameConstants.MAX_GAME_COLUMNS) {
			throw new GameException("Position x(" + position.getX() + ") out of range");
		}

		if (position.getY() < 0 || position.getY() >= GameConstants.MAX_GAME_ROWS) {
			throw new GameException("Position y(" + position.getY() + ") out of range");
		}
	}

	/* (non-Javadoc)
	 * @see model.mapgame.IMapGame#isPositionBusy(game.commons.Position)
	 */
	@Override
	public boolean isPositionBusy(Position pos) throws GameException {
		checkPosition(pos);
		return elements[pos.getY()][pos.getX()] != null;

	}

	/* (non-Javadoc)
	 * @see model.mapgame.IMapGame#removeElement(game.commons.Position)
	 */
	@Override
	public void removeElement(Position position) throws GameException {
		//checkPosition(position);
		
		elements[position.getY()][position.getX()] = null;
	}

	/* (non-Javadoc)
	 * @see model.mapgame.IMapGame#setLorann(model.mapgame.sprite.character.ILorann)
	 */
	@Override
	public void setLorann(ILorann lorann) {
		this.lorann = lorann;
	}

	/* (non-Javadoc)
	 * @see model.mapgame.IMapGame#getLorann()
	 */
	@Override
	public ILorann getLorann() {
		return lorann;
	}
}
