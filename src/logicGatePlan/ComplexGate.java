
package logicGatePlan;

/**
 * The parent class for more complex gates, that are build from a combination of other gates
 * They may even be saved modules
 * @author Lumentus
 */
public abstract class ComplexGate extends Gate {
  private static final long serialVersionUID = 7137237074732483642L;

  public ComplexGate(int numOfInputs) {
    super(numOfInputs);
  }
}
