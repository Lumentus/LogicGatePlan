package logicGatePlan;

import java.util.ArrayList;
import java.util.List;

public abstract class Gate extends Component{
	protected int numOfInputs;
	protected List<Boolean> inputs;
	
	public Gate()
	{
		this(2);
	}
	
	public Gate(int numOfInputs)
	{
		this.numOfInputs = numOfInputs;
		this.inputs = new ArrayList<Boolean>();
		for(int i = 0; i < this.numOfInputs; i++)
		{
			this.inputs.add(false);
		}
	}
	
	public abstract Boolean output();
}
