package View;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;



	public class LoginEmployee extends JFrame{
	    
		   JComboBox LogInAs;
		   JLabel mail;
		    JTextField mailTextField1;
		    JPanel p1,p2;
		    JLabel pw;
		    JPasswordField pwField1;
		    // End of variables declaration    
		    
		    
		   
		    
		    public LoginEmployee() {
		        
		        JFrame LoginEmployee =new JFrame();
		         p1 = new JPanel();
		         p2 = new JPanel();
		         mail = new JLabel();
		         pw = new JLabel();
		         mailTextField1 = new JTextField();
		         pwField1 = new JPasswordField();
		         LogInAs = new JComboBox();
		         
		         LoginEmployee.setSize(470,420);
		         LoginEmployee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		         LoginEmployee.getContentPane().setLayout(null);
		         LoginEmployee.getContentPane().add(p2);
		        
		     
		        p2.setBackground(new java.awt.Color(51, 0, 51));
		        p2.setBounds(0,0, 400,300);
		        p2.setLayout(null);
		        
		        p1.setBackground(new java.awt.Color(102, 102, 102));
		        p1.setBounds(0,0, 400,300);
		        p1.setLayout(null);
		      
		        
		        
		        mail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		        mail.setForeground(new java.awt.Color(255, 255, 255));
		        mail.setText("E-mail:");
		        mail.setBackground(new java.awt.Color(240,240,240));
		        p2.add(mail);
		        mail.setBounds(50, 110, 80, 30);

		        
		        
		        
		        pw.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		        pw.setForeground(new java.awt.Color(255, 255, 255));
		        pw.setText("Password:");
		        p2.add(pw);
		        pw.setBounds(40, 200, 110, 30);
		        pw.setBackground(new java.awt.Color(240,240,240));
		        
		        
		        
		        mailTextField1.setText(" ");
		        p2.add(mailTextField1);
		        mailTextField1.setBounds(140, 110, 270, 40);

		        
		        
		        
		       
		        pwField1.setText(" ");
		        p2.add(pwField1);
		        pwField1.setBounds(140, 190, 270, 40);
		        
		        
		        LogInAs.setBounds(200, 290, 110, 40);
		        LogInAs.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		        LogInAs.setForeground(new java.awt.Color(51, 0, 255));
		        LogInAs.setBackground(new java.awt.Color(255, 255, 255));
		        LogInAs.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "Trainer", "Nutrition " }));
		        
		        p2.add(LogInAs);
		        
		        
		        LoginEmployee.getContentPane().add(p2);
		        p2.setBounds(0, 0, 460, 390);
		        LoginEmployee.setResizable(false);
		        LoginEmployee.setVisible(true);

		    }
	
	
	
	
	
	 	}