package model.mapgame.sprite.character;

public class Lorann extends AbstractCharacter implements ILorann {

	private final IResult score;

	public Lorann(FBallEnum fBall) {
		super(fBall);
		this.score = new Result();
	}

	@Override
	public IResult getResult() {
		return score;
	}
}
