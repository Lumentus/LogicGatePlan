
package logicGatePlan;

/**
 * The basic OR-gate
 * @author Lumentus
 */
public class OrGate extends BasicGate {

  private static final long serialVersionUID = -6280019350716472638L;

  /**
   * Generates a standard OR-gate
   */
  public OrGate() {
    super();
  }

  @Override
  public Boolean output() {
    return (this.inputs.get(0) || this.inputs.get(1));
  }

}
