package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class Admin {

	private JFrame frame;
	private JTextField textField;
	private JTable table;

	
	public Admin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 485, 408);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(279, 11, 167, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(32, 11, 136, 20);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "First Name", "Last Name", "Active / NotActive"}));
		panel.add(comboBox);
		
		table = new JTable();
		table.setBounds(444, 118, -410, -32);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"First Name", "Last Name", "Schedule", "Email", "Active / NotActive"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(120);
		table.getColumnModel().getColumn(1).setPreferredWidth(128);
		table.getColumnModel().getColumn(2).setPreferredWidth(109);
		table.getColumnModel().getColumn(3).setPreferredWidth(150);
		table.getColumnModel().getColumn(4).setPreferredWidth(116);
		panel.add(table);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(220, 181, 226, 100);
		panel.add(textArea);
		
		JLabel lblAddAdvertisement = new JLabel("Add Advertisement");
		lblAddAdvertisement.setBounds(32, 156, 129, 14);
		lblAddAdvertisement.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAddAdvertisement.setForeground(Color.BLACK);
		lblAddAdvertisement.setBackground(Color.LIGHT_GRAY);
		panel.add(lblAddAdvertisement);
		
		JButton btnPost = new JButton("Post");
		btnPost.setBounds(178, 336, 136, 23);
		btnPost.setForeground(SystemColor.activeCaption);
		btnPost.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnPost.setBackground(Color.GRAY);
		panel.add(btnPost);
		
		JLabel label = new JLabel("");
		label.setBounds(10, 181, 200, 100);
		panel.add(label);
		
		JButton btnUploadImage = new JButton("Upload Image");
		btnUploadImage.setBackground(SystemColor.inactiveCaption);
		btnUploadImage.setBounds(20, 288, 107, 23);
		panel.add(btnUploadImage);
	}
}
