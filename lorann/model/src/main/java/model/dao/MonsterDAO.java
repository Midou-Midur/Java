package model.dao;

import model.mapgame.IMapElement;
import model.mapgame.sprite.character.FBallEnum;
import model.mapgame.sprite.character.Lorann;

public class MonsterDAO extends AbstractDAO {

	public MonsterDAO() {
	}

	public IMapElement getElementByName(String name) {

		switch (name) {

		case "monster1":
			return new Lorann(FBallEnum.FBALL1);
		case "monster2":
			return new Lorann(FBallEnum.FBALL2);
		case "monster3":
			return new Lorann(FBallEnum.FBALL3);
		default:
			return new Lorann(FBallEnum.FBALL1);

		}
	}

}
