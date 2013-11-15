
package Windows;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JPanel;

import logicGatePlan.Plan;

/**
 * Generates what the user sees
 * @author Lumentus
 *
 */
public class PlanView extends JPanel {
  private static final long serialVersionUID = -5215839633433556597L;
  private Plan plan;
  private Point position;
  private double zoom;
  private Component selectedComponent;
  private Point dragOffset;
  private int viewWidth;
  private int viewHeight;

  /**
   * Creates a view just from the width and height of the canvas as well as a zoom factor
   * @param zoom The zoom factor
   */
  public PlanView(double zoom) {
    this(zoom, new Plan());
  }

  /**
   * Creates a view from the width and height of the canvas as well as a zoom factor
   * it also takes the plan displayed
   * @param zoom The zoom factor
   * @param plan The plan, that is displayed
   */
  public PlanView(double zoom, Plan plan) {
    this(zoom, plan, new Point((int) Math.ceil(plan.getWidth() / 2.0), (int) Math.ceil(plan.getHeight() / 2.0)));
  }

  /**
   * Creates a view from the width and height of the canvas as well as a zoom factor
   * it also takes the plan displayed
   * @param zoom The zoom factor
   * @param plan The plan, that is displayed
   * @param position The position of the center of the view on the plan
   */
  public PlanView(double zoom, Plan plan, Point position) {
    this.setPlan(plan);
    this.setPosition(position);
    this.setZoom(zoom);
    this.setPreferredSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
  }

  /**
   * Gets the value of plan attribute
   * @return the plan
   */
  public Plan getPlan() {
    return plan;
  }

  /**
   * Sets the plan field to plan
   * @param plan the plan to set
   */
  public void setPlan(Plan plan) {
    this.plan = plan;
  }

  /**
   * Gets the value of zoom attribute
   * @return the zoom
   */
  public double getZoom() {
    return zoom;
  }

  /**
   * Sets the zoom field to zoom
   * @param zoom the zoom to set
   */
  public void setZoom(double zoom) {
    this.zoom = zoom;
  }

  /**
   * Gets the value of selectedComponent attribute
   * @return the selectedComponent
   */
  public Component getSelectedComponent() {
    return selectedComponent;
  }

  /**
   * Sets the selectedComponent field to selectedComponent
   * @param selectedComponent the selectedComponent to set
   */
  public void setSelectedComponent(Component selectedComponent) {
    this.selectedComponent = selectedComponent;
  }

  /**
   * Gets the value of dragOffset attribute
   * @return the dragOffset
   */
  public Point getDragOffset() {
    return dragOffset;
  }

  /**
   * Sets the dragOffset field to dragOffset
   * @param dragOffset the dragOffset to set
   */
  public void setDragOffset(Point dragOffset) {
    this.dragOffset = dragOffset;
  }

  /**
   * Gets the value of viewWidth attribute
   * @return the viewWidth
   */
  public int getViewWidth() {
    return viewWidth;
  }

  /**
   * Sets the viewWidth field to viewWidth
   * @param viewWidth the viewWidth to set
   */
  public void setViewWidth(int viewWidth) {
    this.viewWidth = viewWidth;
  }

  /**
   * Gets the value of viewHeight attribute
   * @return the viewHeight
   */
  public int getViewHeight() {
    return viewHeight;
  }

  /**
   * Sets the viewHeight field to viewHeight
   * @param viewHeight the viewHeight to set
   */
  public void setViewHeight(int viewHeight) {
    this.viewHeight = viewHeight;
  }

  /**
   * Gets the value of position attribute
   * @return the position
   */
  public Point getPosition() {
    return position;
  }

  /**
   * Sets the center of the "view" on the plan and check whether or not the input point is a valid center and corrects it if not
   * @param position The new position of the center of the "view"
   */
  public void setPosition(Point position) {
    int x, y;
    // Make sure the position is a legal position(not to far to the sides so view space is given away)
    if (position.x < this.viewWidth / 2) {
      x = (int) Math.ceil(this.viewWidth / 2.0);
    } else if (position.x > (this.plan.getWidth() - (int) Math.ceil(this.viewWidth / 2.0))) {
      x = this.plan.getWidth() - (int) Math.ceil(this.viewWidth / 2.0);
    } else {
      x = position.x;
    }
    if (position.y < this.viewHeight / 2) {
      y = (int) Math.ceil(this.viewHeight / 2.0);
    } else if (position.y > (this.plan.getHeight() - (int) Math.ceil(this.viewHeight / 2.0))) {
      y = this.plan.getHeight() - (int) Math.ceil(this.viewHeight / 2.0);
    } else {
      y = position.y;
    }
    this.position = new Point(x, y);
  }

  /**
   * Initalizes the Event used
   */
  public void initializeEvents() {
    this.addMouseMotionListener(new PlanViewMouseMotionAdapter(this));
    this.addMouseListener(new PlanViewMouseAdapter(this));
  }
}