package View;

import java.awt.*;

 import javax.swing.*;
 

public class RegisterationPage {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
 
	public RegisterationPage() {
		initialize();
	}

	 
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1370, 546);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFirstname = new JLabel(" firstname :");
		lblFirstname.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFirstname.setBounds(10, 81, 99, 24);
		frame.getContentPane().add(lblFirstname);
		
		textField = new JTextField();
		textField.setBounds(119, 80, 235, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel(" lastname :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 160, 87, 24);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblEmail = new JLabel("   email :");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmail.setBounds(10, 230, 87, 14);
		frame.getContentPane().add(lblEmail);
		
		textField_1 = new JTextField();
		textField_1.setBounds(119, 224, 235, 31);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel(" password :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 297, 99, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(119, 158, 235, 33);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(119, 291, 235, 31);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton(" Register");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(119, 369, 99, 31);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Freeware Sys\\Desktop\\spokesmodelSearch18-pastWinnersPanel-MichaelKatrina-desktop.jpg"));
		lblNewLabel_2.setBounds(364, 0, 991, 514);
		frame.getContentPane().add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 362, 507);
		frame.getContentPane().add(panel);
		frame.setResizable( false);
		frame.setVisible(true);
		
	}

	 
}


