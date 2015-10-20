package paneTesting;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.EmptyBorder;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

import java.awt.Component;

import javax.swing.Box;

import java.awt.Toolkit;
import java.awt.Dimension;


public class MyFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame frame = new MyFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Sets GTK look&feel
	 */
	{
		// Set Look & Feel

		// javax.swing.UIManager.put("nimbusBase", new Color(50,50,50));
		// javax.swing.UIManager.put("nimbusBlueGrey", new Color(25,0,0));
		// javax.swing.UIManager.put("control", new Color(240,245,245));

		for (LookAndFeelInfo info : javax.swing.UIManager
				.getInstalledLookAndFeels()) {
			try {
				javax.swing.UIManager
						.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Create the frame.
	 */
	public MyFrame() {
		setPreferredSize(new Dimension(700, 0));
		setTitle("paneT");
		setIconImage(Toolkit.getDefaultToolkit().getImage(MyFrame.class.getResource("/icons/Annoying-Hipster@Low.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.rowHeights = new int[] {0, 0};
		gbl_contentPane.columnWidths = new int[] {0, 0, 0};
		gbl_contentPane.columnWeights = new double[] { 1.0, 0.0 };
		gbl_contentPane.rowWeights = new double[] { 1.0, 1.0 };
		contentPane.setLayout(gbl_contentPane);

		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		contentPane.add(panel, gbc_panel);
		panel.setLayout(new GridLayout(1, 2, 0, 0));

		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.Y_AXIS));

		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		panel_4.add(chckbxNewCheckBox);

		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		panel_4.add(chckbxNewCheckBox_1);

		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("New check box");
		panel_4.add(chckbxNewCheckBox_2);

		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.Y_AXIS));

		JRadioButton radioButton = new JRadioButton("1");
		panel_5.add(radioButton);

		JRadioButton radioButton_1 = new JRadioButton("2");
		panel_5.add(radioButton_1);

		Component verticalGlue = Box.createVerticalGlue();
		panel_5.add(verticalGlue);

		JPanel panel_6 = new JPanel();
		panel_5.add(panel_6);
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.X_AXIS));

		JButton btnHip = new JButton("hip");
		panel_6.add(btnHip);
		
		Component horizontalStrut = Box.createHorizontalStrut(10);
		panel_6.add(horizontalStrut);

		JButton button = new JButton("hip");
		panel_6.add(button);

		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.weightx = 5.0;
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 2;
		gbc_panel_1.gridy = 0;
		contentPane.add(panel_1, gbc_panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		panel_1.add(tabbedPane);

		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("New tab", null, tabbedPane_1, null);

		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("New tab", null, tabbedPane_2, null);

		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 1;
		contentPane.add(panel_2, gbc_panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane = new JScrollPane();
		panel_2.add(scrollPane);

		JTextArea textArea = new JTextArea();
		// panel_2.add(textArea, BorderLayout.NORTH);
		scrollPane.setViewportView(textArea);

		JPanel panel_3 = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.insets = new Insets(0, 0, 5, 0);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 1;
		gbc_panel_3.gridy = 1;
		contentPane.add(panel_3, gbc_panel_3);
	}
}
