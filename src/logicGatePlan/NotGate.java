
package logicGatePlan;


public class NotGate extends BasicGate {

  public NotGate() {
    super(1);
  }

  @Override
  public Boolean output() {
    return (!this.inputs.get(0));
  }

}
