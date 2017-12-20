package View;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.LineBorder;

import net.coobird.thumbnailator.Thumbnailator;
import net.coobird.thumbnailator.Thumbnails;
import services.UserProfileRequestService;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class UserProfile extends JFrame {

	private JFrame frame;
	private String email;
	private JLabel firstname, lastname;
	private JTable userSchedule;
	private ImageIcon image;
	public UserProfile(String email) {
		new UserProfileRequestService(email);
	}
	
	public UserProfile() {
	}

	public void response(String firstname, String lastName, ResultSet rs, ResultSet rs2) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					initialize(firstname, lastName, rs, rs2);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});	
	}

	protected void initialize(String firstname, String lastName, ResultSet rs, ResultSet rs2) throws SQLException, IOException {

		frame = new JFrame();
		frame.setBounds(100, 100, 780, 563);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBounds(0, 41, 384, 483);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Nutritionist notes");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		panel.add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		String nutritinistNotes = rs2.getString("nutritionist notes");
		textArea.setText(nutritinistNotes);
		textArea.setRows(7);
		textArea.setColumns(70);
		panel.add(textArea);
		
		JLabel lblNewLabel_1 = new JLabel("Trophic System");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		panel.add(lblNewLabel_1);
				
		Blob imageBlob = rs2.getBlob("trophic system");
		byte[] imageBytes = imageBlob.getBytes(1, (int) imageBlob.length());
		BufferedImage buff_image = ImageIO.read(new ByteArrayInputStream(imageBytes));
		BufferedImage thumbnail = Thumbnails.of(buff_image).size(400, 400).asBufferedImage();
		image = new ImageIcon(buff_image);
		JLabel lblNewLabel_2 = new JLabel();
		lblNewLabel_2.setIcon(image);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_2.setVerticalAlignment(SwingConstants.BOTTOM);
		panel.add(lblNewLabel_2);
		
		Panel panel_1 = new Panel();
		panel_1.setBackground(SystemColor.inactiveCaptionBorder);
		panel_1.setBounds(390, 41, 374, 483);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Schedule");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		panel_1.add(lblNewLabel_3);
		
		userSchedule = new JTable();
		userSchedule.setModel(DbUtils.resultSetToTableModel(rs));
		userSchedule.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.add(userSchedule);
		
		JLabel lbFirstName = new JLabel(firstname);
		lbFirstName.setFont(new Font("Script MT Bold", Font.PLAIN, 21));
		lbFirstName.setBounds(287, 11, 104, 24);
		frame.getContentPane().add(lbFirstName);
		
		JLabel lbLastName = new JLabel(lastName);
		lbLastName.setFont(new Font("Script MT Bold", Font.PLAIN, 21));
		lbLastName.setBounds(395, 11, 97, 24);
		frame.getContentPane().add(lbLastName);
	}

	
}
