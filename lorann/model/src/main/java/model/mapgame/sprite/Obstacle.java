package model.mapgame.sprite;

public class Obstacle extends AbstractSprite implements IObstacle {

	private final KindOfObstacleEnum kindOfObstacle;

	public Obstacle(KindOfObstacleEnum kindOfObstacle) {
		super();
		this.kindOfObstacle = kindOfObstacle;
	}
	
	@Override
	public KindOfObstacleEnum getKindOfObstacle() {
		return this.kindOfObstacle;
	}
}
