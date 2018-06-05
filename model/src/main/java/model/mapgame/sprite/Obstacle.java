package model.mapgame.sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class Obstacle.
 */
public class Obstacle extends AbstractSprite implements IObstacle {

	/** The kind of obstacle. */
	private final KindOfObstacleEnum kindOfObstacle;

	/**
	 * Instantiates a new obstacle.
	 *
	 * @param kindOfObstacle the kind of obstacle
	 */
	public Obstacle(KindOfObstacleEnum kindOfObstacle) {
		super();
		this.kindOfObstacle = kindOfObstacle;
	}
	
	/* (non-Javadoc)
	 * @see model.mapgame.sprite.IObstacle#getKindOfObstacle()
	 */
	@Override
	public KindOfObstacleEnum getKindOfObstacle() {
		return this.kindOfObstacle;
	}
}
