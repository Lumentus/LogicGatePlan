
package logicGatePlan;

import javax.swing.JLabel;

public abstract class LogicComponent extends JLabel {

  private static final long serialVersionUID = 1814026701885493124L;

  public LogicComponent() {
  }

  public abstract Boolean output();
}
