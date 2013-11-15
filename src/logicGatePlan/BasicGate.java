
package logicGatePlan;


public abstract class BasicGate extends Gate {
  public BasicGate() {
    this(2);
  }

  public BasicGate(int numOfInputs) {
    super(numOfInputs);
  }
}
