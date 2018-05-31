package model.mapgame.sprite;

public interface IGate extends ISprite  {
	
	/**
	 * Receiving a state of gate
	 * @return
	 */
	GateStateEnum getGateState();
}
