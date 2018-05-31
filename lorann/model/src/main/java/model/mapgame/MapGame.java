package model.mapgame;

import javax.swing.text.Position;

import game.commons.GameConstants;
import game.commons.GameException;
import game.commons.GamerException;
import game.commons.Position1;
import game.commons.Position2;

public class MapGame implements IMapGame {

	private final IMapElement[][] elements = new IMapElement[GameConstants.MAX_GAME_ROWS][GameConstants.MAX_GAME_COLUMNS];

	@Override
	//Exception => Position (x,y) is busy by an element
	public void addElement(Position position, IMapElement element) throws GameException {
		checkPosition(position);
		if (elements[((Position1) position).getY()][((Position1) position).getX()] != null) {
			throw new GameException("Position (" + ((Position1) position).getX() + ", " + ((Position1) position).getY() + ") is busy");
		}
		//An element has a the position by axes x/y 
		elements[((Position1) position).getY()][((Position1) position).getX()] = element;
		//Position of an element adding in the table of position
		element.setPosition(position);
	}

	@Override
	public IMapElement getElement(Position1 position, Position2 position2) throws GamerException, GameException {
		try {
			checkPosition((Position) position2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (elements[position2.getY()][position2.getX()] == elements[position2.getY2()][position2.getX2()]) {
			throw new GamerException("Position (" + position2.getX2() + ", " + position2.getY2() + ") is busy"); 
			
		}
		
		return elements[position2.getY()][position2.getX()];
	}

	@Override
	public void removeElement(Position position) {
		
	}

	void checkPosition(Position position) throws GameException {
		if (((Position1) position).getX() < 0 || ((Position1) position).getX() >= GameConstants.MAX_GAME_COLUMNS) {
			throw new GameException("Position x(" + ((Position1) position).getX() + ") out of range");
		}

		if (((Position1) position).getY() < 0 || ((Position1) position).getY() >= GameConstants.MAX_GAME_ROWS) {
			throw new GameException("Position y(" + ((Position1) position).getY() + ") out of range");
		}
	}

	@Override
	public void addElement(Position1 position, IMapElement element) throws GameException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IMapElement getElement(Position1 position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeElement(Position1 position) {
		// TODO Auto-generated method stub
		
	}
}
