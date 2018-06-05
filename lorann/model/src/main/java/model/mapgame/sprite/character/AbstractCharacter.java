package model.mapgame.sprite.character;

import model.mapgame.AbstractMapElement;

public abstract class AbstractCharacter extends AbstractMapElement implements ICharacter {

	private FBallEnum fBall;

	public AbstractCharacter(final FBallEnum fBall) {
		super();
		this.fBall = fBall;
	}

	public FBallEnum getFBall() {
		return fBall;
	}

	public void setFBall(FBallEnum fBall) {
		this.fBall = fBall;
	}
	
	@Override
	public boolean isAlive() {
		
		return fBall != null;
	}
}
