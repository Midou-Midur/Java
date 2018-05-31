package model.mapgame.sprite.character;

public class Lorann extends AbstractCharacter implements ILorann {

	private Result result;

	public Lorann(Result result) {
		super();
		this.result = result;
	}

	public Result getResult() {
		return result;
	}

	@Override
	public boolean isAlive() {
		// TODO Auto-generated method stub
		return false;
	}

}
