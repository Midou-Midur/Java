package model.mapgame;

import game.commons.Position;

// TODO: Auto-generated Javadoc
/**
 * The Class AbstractMapElement.
 */
public abstract class AbstractMapElement implements IMapElement {

	/** The id cpt. */
	private static long idCpt;
	
	/** The id. */
	private final Long id;
	
	/** The position. */
	private Position position;
	
	/**
	 * Instantiates a new abstract map element.
	 */
	public AbstractMapElement() {
		id = idCpt++;
	}
	
	/* (non-Javadoc)
	 * @see model.mapgame.IMapElement#getId()
	 */
	@Override
	public Long getId() {
		return this.id;
	}

	/* (non-Javadoc)
	 * @see model.mapgame.IMapElement#setPosition(game.commons.Position)
	 */
	@Override
	public void setPosition(Position position) {
		this.position = position;
	}

	/* (non-Javadoc)
	 * @see model.mapgame.IMapElement#getPosition()
	 */
	@Override
	public Position getPosition() {
		return this.position;
	}
	
}
