package model.dao;

import model.mapgame.IMapElement;
import model.mapgame.sprite.Cball;

public class CBallDAO extends AbstractDAO {

	public CBallDAO() {
	}

	public IMapElement getElementByName(String name) {
		return new Cball();
	}
}
