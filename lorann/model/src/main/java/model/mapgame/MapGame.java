package model.mapgame;

import game.commons.GameConstants;
import game.commons.GameException;
import game.commons.Position;

public class MapGame implements IMapGame {

	private final IMapElement[][] elements = new IMapElement[GameConstants.MAX_GAME_ROWS][GameConstants.MAX_GAME_COLUMNS];

	@Override
	public void addElement(Position position, IMapElement element) throws GameException {
		checkPosition(position);
		if (elements[(position).getY()][(position).getX()] != null) {
			throw new GameException(
					"Position (" + (position).getX() + ", " + (position).getY() + ") is busy");
		}
		// An element has a the position by axes x/y
		elements[(position).getY()][(position).getX()] = element;
		// Position of an element adding in the table of position
		element.setPosition(position);
	}

	@Override
	public IMapElement getElement(Position position) throws GameException {

		checkPosition(position);

		return elements[position.getY()][position.getX()];
	}

	protected void checkPosition(Position position) throws GameException {
		if (position.getX() < 0 || position.getX() >= GameConstants.MAX_GAME_COLUMNS) {
			throw new GameException("Position x(" + position.getX() + ") out of range");
		}

		if (position.getY() < 0 || position.getY() >= GameConstants.MAX_GAME_ROWS) {
			throw new GameException("Position y(" + position.getY() + ") out of range");
		}
	}

	@Override
	public void removeElement(Position position) throws GameException {
		checkPosition(position);
		elements[position.getY()][position.getX()] = null;
	}
}
