package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.border.EmptyBorder;

import model.HomePageAdsDTO;

public class HomePage extends JFrame {

	private JPanel contentPane;
	private HomePage frame ;

	
	public HomePage ()
	{
		
	}
	public HomePage(HomePageAdsDTO dto) {
		new HomePage();
		frame.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		initialize();
		new PostUI (dto);
	}
	
	private void initialize() {
		frame = (HomePage) new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		// create toolbar
		
		JToolBar toolbar = new JToolBar ();
		frame.add(toolbar, BorderLayout.NORTH);
	    toolbar.setFloatable(false);
		JButton profileButton = new JButton ("My Profile");
		toolbar.add(profileButton);
		profileButton.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
						
		//navigating to profile
	    UserProfile userprofile = new  UserProfile ();
	    userprofile.setVisible(true);
	    userprofile.setSize(600, 400);
	    userprofile.setTitle("Profile");
		//secondpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.dispose(); 
		}
	});
	}
	
	}


