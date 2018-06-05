package model.dao;

import model.mapgame.IMapElement;
import model.mapgame.sprite.character.FBallEnum;
import model.mapgame.sprite.character.Monster;
import model.mapgame.sprite.character.MonsterNumberEnum;

public class MonsterDAO extends AbstractDAO {

	public MonsterDAO() {
	}

	public IMapElement getElementByName(String name) {

		switch (name) {

		case "monster1":
			return new Monster(FBallEnum.FBALL1, MonsterNumberEnum.MONSTER1);
		case "monster2":
			return new Monster(FBallEnum.FBALL2, MonsterNumberEnum.MONSTER2);
		case "monster3":
			return new Monster(FBallEnum.FBALL3, MonsterNumberEnum.MONSTER3);
		default:
			return new Monster(FBallEnum.FBALL4, MonsterNumberEnum.MONSTER4);

		}
	}

}
