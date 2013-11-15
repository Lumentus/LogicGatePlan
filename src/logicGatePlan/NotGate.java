
package logicGatePlan;

/**
 * The basic NOT-Gate
 * @author Lumentus
 */
public class NotGate extends BasicGate {

  private static final long serialVersionUID = 1600957081692157073L;

  /**
   * Creates the basic NOT gate
   */
  public NotGate() {
    super(1);
  }

  @Override
  public Boolean output() {
    return (!this.inputs.get(0));
  }

}
