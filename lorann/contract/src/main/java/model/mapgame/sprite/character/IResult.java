package model.mapgame.sprite.character;

import model.mapgame.sprite.IPurse;

public interface IResult {

	/**
	 * Receiving the Purse
	 * 
	 * @return
	 */
	int getPurse();

	/**
	 * Putting a Purse to the score
	 * 
	 * @param purse
	 */
	void addPurse(IPurse purse);
}
