package model.mapgame;

import game.commons.Position;

public abstract class AbstractMapElement implements IMapElement {

	private static long idCpt;
	private final Long id;
	private Position position;
	
	public AbstractMapElement() {
		id = idCpt++;
	}
	
	@Override
	public Long getId() {
		return this.id;
	}

	@Override
	public void setPosition(Position position) {
		this.position = position;
	}

	@Override
	public Position getPosition() {
		return this.position;
	}
	
}
