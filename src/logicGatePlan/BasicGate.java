
package logicGatePlan;

/**
 * This is the abstract class for the most basic gates like AND, OR and NOT
 * @author Lumentus
 */
public abstract class BasicGate extends Gate {
  private static final long serialVersionUID = 1285166548617592975L;

  /**
   * This constructor creates a basic gate with two input "pins"
   */
  public BasicGate() {
    this(2);
  }

  /**
   * This constructor creates a basic gate with numOfInput input "pins"
   * @param numOfInputs The number of input pins of the new gate
   */
  public BasicGate(int numOfInputs) {
    super(numOfInputs);
  }
}
