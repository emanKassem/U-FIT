package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import services.RegisterationServiceRequest;

public class  RegisterationPage extends JFrame implements ActionListener {
	 private JFrame frame;
	 private JTextField firstname,lastname,email;
	 private JPasswordField password;
	 private JButton btn;
	 public RegisterationPage()  {
		initialize();
	}
		public void initialize() {
			frame = new JFrame();
			frame.getContentPane().setForeground(Color.PINK);
			frame.getContentPane().setBackground(Color.DARK_GRAY);
			frame.setBounds(100, 100, 750, 519);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			JLabel fn = new JLabel(" FirstName :");
			 fn.setForeground(Color.PINK);
			 fn.setFont(new Font("Tahoma", Font.BOLD, 14));
			 fn.setBounds(127, 65, 108, 30);
			frame.getContentPane().add( fn);
			
			 firstname = new JTextField();
			 firstname.setBounds(241, 56, 315, 39);
			frame.getContentPane().add( firstname);
			firstname.setColumns(10);
			
			JLabel  ln = new JLabel("LastName :");
			 ln.setForeground(Color.PINK);
			 ln.setFont(new Font("Tahoma", Font.BOLD, 14));
			 ln.setBounds(127, 138, 86, 23);
			frame.getContentPane().add( ln);
			
			 lastname = new JTextField();
			 lastname.setBounds(241, 132, 315, 39);
			frame.getContentPane().add( lastname);
			 lastname.setColumns(10);
			
			JLabel  em = new JLabel(" Email :");
			 em.setForeground(Color.PINK);
			 em.setFont(new Font("Tahoma", Font.BOLD, 14));
			 em.setBounds(127, 208, 86, 30);
			frame.getContentPane().add( em);
			
			 email = new JTextField();
			 email.setBounds(241, 206, 315, 39);
			 frame.getContentPane().add( email);
			 email.setColumns(10);
			
			JLabel  pass = new JLabel("Password :");
			 pass.setForeground(Color.PINK);
			 pass.setFont(new Font("Tahoma", Font.BOLD, 14));
			 pass.setBounds(127, 277, 86, 30);
			frame.getContentPane().add( pass);
			
			 password = new JPasswordField();
			 password.setBounds(241, 277, 315, 39);
			frame.getContentPane().add( password);
			
		  btn = new JButton("Register");
		  btn.addActionListener(new ActionListener() {
		  	public void actionPerformed(ActionEvent arg0) {
		  	}
		  });
			 btn.setFont(new Font("Tahoma", Font.BOLD, 14));
			 btn.setBackground(Color.LIGHT_GRAY);
			 btn.setForeground(Color.GRAY);
			 btn.setBounds(241, 372, 100, 39);
			frame.getContentPane().add(btn);
			frame.setVisible( true);
			frame.setResizable( false);
	}
		@Override 
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()== btn)
	        {
				String fname=firstname.getText();
				String lname=lastname.getText();
				String mail=email.getText();
				String pass=password.getText();
				RegisterationServiceRequest rs=new RegisterationServiceRequest( fname,  lname,  mail,  pass);
	           
	           
	        
	        }
			
		}
		public void response(String message,String email ) {
			if(message=="success")
			{
				JOptionPane.showInputDialog("Registeration success"+message );	
				//LoginView v=new LoginView();
			}
			else
			{
				JOptionPane.showInputDialog("Registeration failed" );
			}
			
			
		}
}