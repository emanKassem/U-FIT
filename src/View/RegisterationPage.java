package View;
  import javax.swing.*;

import services.RegisterationServiceRequest;

import java.awt.*;
import java.awt.event.*;


public class RegisterationPage extends JFrame implements ActionListener {
	
	 	private JFrame frame;
	 	private JTextField  firstname;
	 	private JTextField  lastname;
	 	private JTextField  email;
	 	private JPasswordField  password;
	 	JButton  btn;
	  
	 	public RegisterationPage()   {
	         initialize();
	 	}
	 
	 	 
	 	private void initialize() {
	 		frame = new JFrame();
	 		frame.setBounds(100, 100, 1370, 546);
	 		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 		frame.getContentPane().setLayout(null);
	 		
	 		JLabel  fn = new JLabel(" firstname :");
	 		 fn.setForeground(Color.ORANGE);
	 		 fn.setFont(new Font("Tahoma", Font.BOLD, 14));
	 	     fn.setBounds(10, 81, 99, 24);
	 	    frame.getContentPane().add( fn);
	 	
	 		 firstname = new JTextField();
	 	     firstname.setBounds(119, 80, 235, 31);
			 frame.getContentPane().add( firstname);
	 	     firstname.setColumns(10);
	 	
	 	  JLabel  ln = new JLabel(" lastname :");
	 	     ln.setForeground(Color.ORANGE);
	 		 ln.setFont(new Font("Tahoma", Font.BOLD, 14));
	 		 ln.setBounds(10, 160, 87, 24);
	 		frame.getContentPane().add( ln);
	 		
	 		JLabel  em = new JLabel("   email :");
	 		 em.setForeground(Color.ORANGE);
	 		 em.setFont(new Font("Tahoma", Font.BOLD, 14));
	 		 em.setBounds(10, 230, 87, 14);
	 		frame.getContentPane().add( em);
	 		
	 		 lastname = new JTextField();
	 		 lastname.setBounds(119, 224, 235, 31);
	 		frame.getContentPane().add( lastname);
	 		 lastname.setColumns(10);
	 		
	 		JLabel  pass = new JLabel(" password :");
	 		 pass.setForeground(Color.ORANGE);
	 		 pass.setFont(new Font("Tahoma", Font.BOLD, 14));
	 		 pass.setBounds(10, 297, 99, 14);
	 		 frame.getContentPane().add( pass);
	 		
	 		 email = new JTextField();
	 		 email.setBounds(119, 158, 235, 33);
	 		 frame.getContentPane().add( email);
	 		 email.setColumns(10);
	 		
	 		 password = new JPasswordField();
	 		 password.setBounds(119, 291, 235, 31);
	         frame.getContentPane().add( password);
	 		
	 	btn = new JButton(" Register");
	 		 btn.setFont(new Font("Tahoma", Font.BOLD, 14));
	 	     btn.setBounds(119, 369, 99, 31);
	 		frame.getContentPane().add( btn);
	 	
	 		JLabel  label2 = new JLabel( );
	 		 label2.setIcon(new ImageIcon("C:\\Users\\Freeware Sys\\Desktop\\spokesmodelSearch18-pastWinnersPanel-MichaelKatrina-desktop.jpg"));
	 	      label2.setBounds(364, 0, 999, 514);
	 		frame.getContentPane().add(label2);
			
	 		JPanel panel = new JPanel();
	 		panel.setBackground(Color.DARK_GRAY);
	 		panel.setBounds(0, 0, 362, 546);
	 	    frame.getContentPane().add(panel);
	 		frame.setResizable( false);
	 		frame.setVisible(true);
	 	}


		@Override
		public void actionPerformed(ActionEvent e) {
			  if(e.getSource()== btn)
		        {
		        JOptionPane.showMessageDialog(null, "Welcome Mr/Ms " +  firstname.getText());
		           
		        
		        }
			
		}
	 	 
	 
	 	 
	 }





