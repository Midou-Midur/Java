package model.mapgame.sprite;

public class Gate extends AbstractSprite implements IGate {

	private final GateStateEnum gateState;
	
	public Gate(GateStateEnum gateState) {
		super();
		this.gateState = gateState;
	}
	
	@Override
	public GateStateEnum getGateState() {
		return this.gateState;
	}

}
