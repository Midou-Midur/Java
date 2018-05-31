package model.mapgame;

import game.commons.Position;

public abstract class AbstractMapElement implements IMapElement {

	private Position position;
	
	@Override
	public void setPosition(Position position) {
		this.position = position;
	}

	@Override
	public Position getPosition() {
		return this.position;
	}
	
}
