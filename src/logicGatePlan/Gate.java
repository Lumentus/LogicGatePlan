
package logicGatePlan;

import java.util.ArrayList;
import java.util.List;

/**
 * The parent class for all gates
 * @author Lumentus
 */
public abstract class Gate extends LogicComponent {
  private static final long serialVersionUID = 7026750614334122777L;
  protected int numOfInputs;
  protected List<Boolean> inputs;

  /**
   * This constructor creates a gate with two input "pins"
   */
  public Gate() {
    this(2);
  }

  /**
   * This constructor creates a gate with numOfInput input "pins"
   * @param numOfInputs The number of input pins of the new gate
   */
  public Gate(int numOfInputs) {
    this.numOfInputs = numOfInputs;
    this.inputs = new ArrayList<Boolean>();
    for (int i = 0; i < this.numOfInputs; i++) {
      this.inputs.add(false);
    }
  }

  /**
   * sets the input
   * @param number the number of the input "pin"
   * @param state the state it should be set to
   */
  public void setInput(int number, Boolean state) {
    inputs.set(number, state);
  }
}
