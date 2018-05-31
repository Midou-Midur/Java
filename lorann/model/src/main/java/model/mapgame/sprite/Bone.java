package model.mapgame.sprite;

public class Bone extends AbstractSprite implements IBone{
	
	private DirectionEnum dir;
	
	public Bone(DirectionEnum dir) {
		super();
		this.dir = dir;
	}

	public DirectionEnum getDir() {
		return this.dir;
	}
}
