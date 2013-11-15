
package logicGatePlan;

/**
 * The plan where all components are saved in
 * @author Lumentus
 */
public class Plan {
  private int width;
  private int height;

  public Plan() {
    this(400, 300);
  }

  public Plan(int width, int height) {
    this.setWidth(width);
    this.setHeight(height);
  }

  /**
   * Gets the value of width attribute
   * @return the width
   */
  public int getWidth() {
    return width;
  }

  /**
   * Sets the width field to width
   * @param width the width to set
   */
  public void setWidth(int width) {
    this.width = width;
  }

  /**
   * Gets the value of height attribute
   * @return the height
   */
  public int getHeight() {
    return height;
  }

  /**
   * Sets the height field to height
   * @param height the height to set
   */
  public void setHeight(int height) {
    this.height = height;
  }
}
