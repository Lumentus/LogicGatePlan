
package logicGatePlan;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public abstract class Gate extends Component {
  protected int numOfInputs;
  protected List<Boolean> inputs;

  public Gate(Point position) {
    this(position, 2);
  }

  public Gate(Point position, int numOfInputs) {
    super(position);
    this.numOfInputs = numOfInputs;
    this.inputs = new ArrayList<Boolean>();
    for (int i = 0; i < this.numOfInputs; i++) {
      this.inputs.add(false);
    }
  }

  public void setInput(int number, Boolean state) {
    inputs.set(number, state);
  }
}
