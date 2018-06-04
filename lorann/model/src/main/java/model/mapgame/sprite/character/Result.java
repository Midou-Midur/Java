package model.mapgame.sprite.character;

import model.mapgame.sprite.IPurse;

public class Result implements IResult {

	int score = 0;

	@Override
	public int getPurse() {
		return score;
	}

	@Override
	public void addPurse(IPurse purse) {
		score++;
	}
}