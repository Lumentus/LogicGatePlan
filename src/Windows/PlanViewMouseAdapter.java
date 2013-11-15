
package Windows;

import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingUtilities;

/**
 * This is the MouseAdapter child, that is used by the PlanView Class for its events
 * @author Lumentus
 */

public class PlanViewMouseAdapter extends MouseAdapter {
  private PlanView view;

  /**
   * Creates the event handler
   * @param view the view that uses the event handler generated object
   */
  public PlanViewMouseAdapter(PlanView view) {
    this.view = view;
  }

  /**
   * In this method the things are done which should be done when a mouse key is pressed
   */
  @Override
  public void mousePressed(MouseEvent e) {
    if (SwingUtilities.isLeftMouseButton(e)) {
      Point clickLoc = new Point(e.getX(), e.getY());
      Component temp = view.getComponentAt(clickLoc.x, clickLoc.y);
      view.setSelectedComponent(temp);
      view.setDragOffset(new Point(clickLoc.x - temp.getX(), clickLoc.y - temp.getY()));
    }
  }

  /**
   * In this method the things are done, which should be done when a mouse key is released
   */
  @Override
  public void mouseReleased(MouseEvent e) {
    if (SwingUtilities.isLeftMouseButton(e)) {
      view.setSelectedComponent(null);
      view.setDragOffset(null);
    }
  }
}