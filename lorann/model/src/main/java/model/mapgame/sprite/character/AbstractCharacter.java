package model.mapgame.sprite.character;

import model.mapgame.AbstractMapElement;

public abstract class AbstractCharacter extends AbstractMapElement implements ICharacter {

	private final FBallEnum fBall;

	public AbstractCharacter(final FBallEnum fBall) {
		super();
		this.fBall = fBall;
	}

	public FBallEnum getfBall() {
		return fBall;
	}

}
