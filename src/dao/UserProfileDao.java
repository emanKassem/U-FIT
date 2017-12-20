package dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import controller.UserProfileController;
import model.Trainee;

public class UserProfileDao implements GenericDao{

	//database connection 
	DataBaseConnection dbc = new DataBaseConnection ();
	
	Trainee trainee = new Trainee();
	UserProfileController userProfileController = new UserProfileController();
	
	public UserProfileDao(String email) {
		trainee.setEmail(email);
		findAll();
	}

	@Override
	public void findAll() {
		
		String searchQuery = "select * from trainee where email='" + trainee.getEmail() + "'" ; 
		String searchQueryForNutrionist;
		
		try {
			Statement stmt=dbc.con.createStatement(); 
			ResultSet rs = stmt.executeQuery(searchQuery);
			
		      while (rs.next())
		      {
		        trainee.setFirstName(rs.getString("firstname"));
		        trainee.setLastName(rs.getString("lastname"));
		        trainee.setSchedule(rs.getInt("schedule"));
		        if(trainee.getSchedule() == 1) {
		        	
		        	searchQuery = "select * from schedule2days" ; 
		        	searchQueryForNutrionist = "SELECT * FROM nutritionist where schedule = 1";
		        	
		        }else if(trainee.getSchedule() == 2) {
		        	
		        	searchQuery = "select * from schedule3days" ;
		        	searchQueryForNutrionist = "SELECT * FROM nutritionist where schedule = 2";

		        	
		        }else {
		        	
		        	searchQuery = "select * from scheduleeverydays" ;
		        	searchQueryForNutrionist = "SELECT * FROM nutritionist where schedule = 3";

		        	
		        }   
		        rs = stmt.executeQuery(searchQuery);
		        ResultSet rs2 = stmt.executeQuery(searchQueryForNutrionist);
	        	userProfileController.requestFromDao(trainee.getFirstName(), trainee.getLastName(), rs, rs2);
		      }
		      stmt.close();
			
		}catch (Exception e)
    	{
    		e.printStackTrace();
		}

	}

	@Override
	public List<String> findByID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(String t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		
	}
}
