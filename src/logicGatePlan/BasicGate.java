
package logicGatePlan;

import java.awt.Point;

public abstract class BasicGate extends Gate {
  public BasicGate(Point position) {
    this(position, 2);
  }

  public BasicGate(Point position, int numOfInputs) {
    super(position, numOfInputs);
  }
}
