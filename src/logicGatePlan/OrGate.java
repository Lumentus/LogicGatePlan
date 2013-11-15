
package logicGatePlan;

import java.awt.Point;

public class OrGate extends BasicGate {

  public OrGate(Point position) {
    super(position);
  }

  @Override
  public Boolean output() {
    return (this.inputs.get(0) || this.inputs.get(1));
  }

}
