
package logicGatePlan;

import java.awt.Point;

public class NotGate extends BasicGate {

  public NotGate(Point position) {
    super(position, 1);
  }

  @Override
  public Boolean output() {
    return (!this.inputs.get(0));
  }

}
