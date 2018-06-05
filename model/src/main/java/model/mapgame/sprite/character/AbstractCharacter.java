package model.mapgame.sprite.character;

import model.mapgame.AbstractMapElement;

// TODO: Auto-generated Javadoc
/**
 * The Class AbstractCharacter.
 */
public abstract class AbstractCharacter extends AbstractMapElement implements ICharacter {

	/** The ball. */
	private FBallEnum fBall;

	/**
	 * Instantiates a new abstract character.
	 *
	 * @param fBall the f ball
	 */
	public AbstractCharacter(final FBallEnum fBall) {
		super();
		this.fBall = fBall;
	}

	/* (non-Javadoc)
	 * @see model.mapgame.sprite.character.ICharacter#getFBall()
	 */
	public FBallEnum getFBall() {
		return fBall;
	}

	/* (non-Javadoc)
	 * @see model.mapgame.sprite.character.ICharacter#setFBall(model.mapgame.sprite.character.FBallEnum)
	 */
	public void setFBall(FBallEnum fBall) {
		this.fBall = fBall;
	}
	
	/* (non-Javadoc)
	 * @see model.mapgame.sprite.character.ICharacter#isAlive()
	 */
	@Override
	public boolean isAlive() {
		
		return fBall != null;
	}
}
