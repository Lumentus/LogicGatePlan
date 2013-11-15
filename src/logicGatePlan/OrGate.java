
package logicGatePlan;


public class OrGate extends BasicGate {

  public OrGate() {
    super();
  }

  @Override
  public Boolean output() {
    return (this.inputs.get(0) || this.inputs.get(1));
  }

}
