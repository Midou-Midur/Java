package model.mapgame.sprite.character;

// TODO: Auto-generated Javadoc
/**
 * The Class Monster.
 */
public class Monster extends AbstractCharacter implements IMonster {
	
	/** The monster number. */
	private final MonsterNumberEnum monsterNumber;

	/**
	 * Instantiates a new monster.
	 *
	 * @param fBall the f ball
	 * @param monsterNumber the monster number
	 */
	public Monster(FBallEnum fBall, final MonsterNumberEnum monsterNumber) {
		super(fBall);
		this.monsterNumber = monsterNumber;
	}

	/* (non-Javadoc)
	 * @see model.mapgame.sprite.character.IMonster#getMonsterNumber()
	 */
	@Override
	public MonsterNumberEnum getMonsterNumber() {
		return monsterNumber;
	}

}
