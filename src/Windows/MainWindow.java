package Windows;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JToolBar;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.Button;

import javax.swing.SwingConstants;

import java.awt.Canvas;
import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.JSeparator;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingUtilities;

import logicGatePlan.*;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainWindow {

	private JFrame frmGateplan;

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
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGateplan = new JFrame();
		frmGateplan.setTitle("GatePlan");
		frmGateplan.setBounds(100, 100, 696, 502);
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
				if(SwingUtilities.isLeftMouseButton(e) )
				{
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
		
		Canvas canvas = new Canvas();
		canvas.setBackground(Color.WHITE);
		splitPane.setRightComponent(canvas);
	}

}
