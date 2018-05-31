package model.mapgame.sprite.character;

import model.mapgame.IMapElement;

public interface ICharacter extends IMapElement {

	/**
	 * Informing in the state of the character
	 * 
	 * @return
	 */
	boolean isAlive();

	/**
	 * Returning the fball (maybe null)
	 * @return
	 */
	FBallEnum getFBall();

	/**
	 * Modifying the fball
	 * @param fBall
	 */
	void setFBall(FBallEnum fBall);
}
