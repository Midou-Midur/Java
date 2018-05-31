package model.mapgame.sprite.character;

import model.mapgame.IMapElement;

public interface ICharacter extends IMapElement{
	
	/**
	 * Informing in the state of the character
	 * @return
	 */
	boolean isAlive();
}
