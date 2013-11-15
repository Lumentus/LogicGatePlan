
package logicGatePlan;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class AndGate extends BasicGate {

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
