
package logicGatePlan;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 * The basic AND Gate
 * @author Lumentus
 */
public class AndGate extends BasicGate {

  private static final long serialVersionUID = -5240126077200731030L;

  /**
   * This constructor creates a standard AND-gate
   */
  public AndGate() {
    super();
    try {
      this.setIcon(new ImageIcon(ImageIO.read(new File("D:\\Daten\\lukas.hansen\\Desktop\\test.png"))));
    } catch (IOException e) {
      System.out.println("WTF");
    }
  }

  @Override
  public Boolean output() {
    return (this.inputs.get(0) && this.inputs.get(1));
  }
}
