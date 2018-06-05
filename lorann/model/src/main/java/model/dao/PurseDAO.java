package model.dao;

import model.mapgame.IMapElement;
import model.mapgame.sprite.Purse;

public class PurseDAO extends AbstractDAO {

	public PurseDAO() {
	}

	public IMapElement getElementByName(String name) {
		return new Purse();
	}
}
