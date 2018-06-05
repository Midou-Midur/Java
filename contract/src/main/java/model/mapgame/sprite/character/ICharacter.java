package model.mapgame.sprite.character;

import model.mapgame.IMapElement;

// TODO: Auto-generated Javadoc
/**
 * The Interface ICharacter.
 */
public interface ICharacter extends IMapElement {

	/**
	 * Informing in the state of the character.
	 *
	 * @return true, if is alive
	 */
	boolean isAlive();

	/**
	 * Returning the fball (maybe null).
	 *
	 * @return the f ball
	 */
	FBallEnum getFBall();

	/**
	 * Modifying the fball.
	 *
	 * @param fBall the new f ball
	 */
	void setFBall(FBallEnum fBall);
}
