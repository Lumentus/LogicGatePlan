package logicGatePlan;

public class AndGate extends BasicGate {

	public AndGate()
	{
		super();
	}
	
	@Override
	public Boolean output() {
		return (this.inputs.get(0) && this.inputs.get(1));
	}
}
