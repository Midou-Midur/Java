package model.dao;

import model.mapgame.IMapElement;
import model.mapgame.sprite.Gate;

public class GateDAO extends AbstractDAO {

	public GateDAO() {
	}

	public IMapElement getElementByName(String name) {
		return new Gate();
	}

}
