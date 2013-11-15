
package Windows;

import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * This is the MouseMotionAdapter child, that is used by the PlanView Class for its events
 * @author Lumentus
 */

public class PlanViewMouseMotionAdapter extends MouseAdapter {
  private PlanView view;

  /**
   * Creates the event handler
   * @param view The PlanView object, that uses the created handler
   */
  public PlanViewMouseMotionAdapter(PlanView view) {
    this.view = view;
  }

  /**
   * The event handler for the mouse dragged event
   */
  @Override
  public void mouseDragged(MouseEvent e) {
    Component temp;
    Point offset;
    if ((temp = view.getSelectedComponent()) != null && (offset = view.getDragOffset()) != null) {
      temp.setLocation(e.getX() - offset.x, e.getY() - offset.y);
    }
  }
}