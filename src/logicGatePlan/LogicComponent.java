
package logicGatePlan;

import javax.swing.JLabel;

/**
 * The parent class of all components that will be displayed
 * @author Lumentus
 */
public abstract class LogicComponent extends JLabel {

  private static final long serialVersionUID = 1814026701885493124L;

  public LogicComponent() {
  }

  /**
   * The output of the component
   * @return the output of the component
   */
  public abstract Boolean output();
}
