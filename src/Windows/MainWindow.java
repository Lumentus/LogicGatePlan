
package Windows;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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

public class MainWindow {

  private JFrame frmGateplan;
  private PlanView planView;

  /**
   * Launch the application.
   * @param args Main Methods args
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

    frmGateplan.setJMenuBar(createMenu());

    frmGateplan.getContentPane().add(createSplitPane(), BorderLayout.CENTER);
  }

  /**
   * Creates the Menu of the window
   * @return The menu
   */
  public JMenuBar createMenu() {
    JMenuBar menuBar = new JMenuBar();

    JMenu mnFile = new JMenu("File");
    menuBar.add(mnFile);

    JMenuItem mntmNew = new JMenuItem("New");
    mnFile.add(mntmNew);

    JMenu mnComponents = new JMenu("Components");
    menuBar.add(mnComponents);

    JMenuItem mntmAndgate = new JMenuItem("And2-Gate");
    mnComponents.add(mntmAndgate);

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
    return menuBar;
  }

  /**
   * Creates the split pane with its contents
   * @return the splitpane
   */
  public JSplitPane createSplitPane() {
    JSplitPane splitPane = new JSplitPane();

    splitPane.setLeftComponent(createToolbar());

    planView = new PlanView(1.0);

    planView.initializeEvents();

    planView.setBackground(Color.WHITE);
    planView.setLayout(null);
    AndGate andGate = new AndGate();
    andGate.setBounds(290, 5, 34, 34);
    planView.add(andGate);
    splitPane.setRightComponent(planView);
    return splitPane;
  }

  /**
   * Creates the Toolbar on the left side of the window
   * @return The toolbar
   */
  public JToolBar createToolbar() {
    JToolBar toolBar = new JToolBar();
    toolBar.setFloatable(false);
    toolBar.setOrientation(SwingConstants.VERTICAL);

    JLabel lblAbhdawwad = new JLabel("abhdawwad");
    toolBar.add(lblAbhdawwad);

    JLabel lblNewLabel = new JLabel("New label");
    toolBar.add(lblNewLabel);
    return toolBar;
  }
}
