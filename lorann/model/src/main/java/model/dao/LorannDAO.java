package model.dao;

import model.mapgame.IMapElement;
import model.mapgame.sprite.character.FBallEnum;
import model.mapgame.sprite.character.Lorann;

public class LorannDAO extends AbstractDAO {

	public LorannDAO() {
	}
	
	public IMapElement getElementByName(String name) {
		return new Lorann(FBallEnum.FBALLORANN);
	}
}
