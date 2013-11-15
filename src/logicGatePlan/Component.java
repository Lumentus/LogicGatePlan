
package logicGatePlan;

import java.awt.Point;

public abstract class Component {
  private Point position;// Die Position der !oberen linken Ecke! des Bauteils

  public Component(Point position) {
    this.position = position;
  }

  public abstract Boolean output();
}
