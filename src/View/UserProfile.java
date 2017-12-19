package View;

import javax.swing.*;

import services.UserProfileRequestService;

import java.awt.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class UserProfile extends JFrame {

	private JFrame frame;
	private String email;
	private JLabel firstname, lastname;
	private JTable userSchedule;
	public UserProfile(String email) {
		new UserProfileRequestService(email);
	}
	
	public UserProfile() {
	}

	public void response(String firstname, String lastName, ResultSet rs) {
		
		frame = new JFrame();
		this.firstname = new JLabel(firstname);
		this.firstname.setForeground(Color.PINK);
		this.firstname.setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().add(this.firstname);
		
		this.lastname = new JLabel(lastName);
		this.lastname.setForeground(Color.PINK);
		this.lastname.setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().add(this.lastname);
		 
		userSchedule=new JTable();
	    userSchedule.setModel(DbUtils.resultSetToTableModel(rs));
	    JScrollPane sp=new JScrollPane(userSchedule);  
	    frame.add(sp);
	    frame.setSize(300,400);    
	    frame.setVisible(true);
	   
		
	}
}
