
package logicGatePlan;

import java.awt.Point;

public class AndGate extends BasicGate {

  public AndGate(Point position) {
    super(position);
  }

  @Override
  public Boolean output() {
    return (this.inputs.get(0) && this.inputs.get(1));
  }
}
