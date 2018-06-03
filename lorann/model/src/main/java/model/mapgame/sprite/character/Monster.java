package model.mapgame.sprite.character;

public class Monster extends AbstractCharacter implements IMonster {
	private final MonsterNumberEnum monsterNumber;

	public Monster(FBallEnum fBall, final MonsterNumberEnum monsterNumber) {
		super(fBall);
		this.monsterNumber = monsterNumber;
	}

	@Override
	public MonsterNumberEnum getMonsterNumber() {
		return monsterNumber;
	}

}
