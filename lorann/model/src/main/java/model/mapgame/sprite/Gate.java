package model.mapgame.sprite;

public class Gate extends AbstractSprite implements IGate {

	private GateStateEnum gateState;
	
	public Gate(GateStateEnum gateState) {
		super();
		this.gateState = gateState;
	}
	
	@Override
	public GateStateEnum getGateState() {
		return this.gateState;
	}

}
