
package Windows;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import logicGatePlan.AndGate;
import logicGatePlan.PlanView;

public class MainWindow {

  private JFrame frmGateplan;
  private PlanView planView;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          MainWindow window = new MainWindow();
          window.frmGateplan.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the application.
   * @throws IOException 
   */
  public MainWindow() throws IOException {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   * @throws IOException
   */
  private void initialize() throws IOException {
    frmGateplan = new JFrame();
    frmGateplan.setTitle("GatePlan");
    frmGateplan.setBounds(100, 100, 697, 503);
    frmGateplan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JMenuBar menuBar = new JMenuBar();
    frmGateplan.setJMenuBar(menuBar);

    JMenu mnFile = new JMenu("File");
    menuBar.add(mnFile);

    JMenuItem mntmNew = new JMenuItem("New");
    mnFile.add(mntmNew);

    JMenu mnComponents = new JMenu("Components");
    menuBar.add(mnComponents);

    JMenu mnHelp = new JMenu("Help");
    menuBar.add(mnHelp);

    JMenuItem mntmTest = new JMenuItem("Test");
    mntmTest.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        if (SwingUtilities.isLeftMouseButton(e)) {
          JOptionPane.showMessageDialog(null, "Test");
        }
      }
    });
    menuBar.add(mntmTest);

    JSplitPane splitPane = new JSplitPane();
    frmGateplan.getContentPane().add(splitPane, BorderLayout.CENTER);

    JToolBar toolBar = new JToolBar();
    toolBar.setOrientation(SwingConstants.VERTICAL);
    splitPane.setLeftComponent(toolBar);

    JLabel lblAbhdawwad = new JLabel("abhdawwad");
    toolBar.add(lblAbhdawwad);

    JLabel lblNewLabel = new JLabel("New label");
    toolBar.add(lblNewLabel);

    planView = new PlanView(0, 0, 1.0);
    planView.addMouseMotionListener(new MouseMotionAdapter() {
      @Override
      public void mouseDragged(MouseEvent e) {
        Component temp;
        Point offset;
        if ((temp = planView.getSelectedComponent()) != null && (offset = planView.getDragOffset()) != null) {
          temp.setLocation(e.getX() - offset.x, e.getY() - offset.y);
        }
      }
    });
    planView.addMouseListener(new MouseAdapter() {
      @Override
      public void mousePressed(MouseEvent e) {
        if (SwingUtilities.isLeftMouseButton(e)) {
          Point clickLoc = new Point(e.getX(), e.getY());
          Component temp = planView.getComponentAt(clickLoc.x, clickLoc.y);
          planView.setSelectedComponent(temp);
          planView.setDragOffset(new Point(clickLoc.x - temp.getX(), clickLoc.y - temp.getY()));
        }
      }

      @Override
      public void mouseReleased(MouseEvent e) {
        if (SwingUtilities.isLeftMouseButton(e)) {
          planView.setSelectedComponent(null);
          planView.setDragOffset(null);
        }
      }
    });
    planView.setBackground(Color.WHITE);
    planView.setLayout(null);
    AndGate andGate = new AndGate();
    andGate.setBounds(290, 5, 34, 34);
    planView.add(andGate);
    splitPane.setRightComponent(planView);
  }
}
