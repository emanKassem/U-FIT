
package dao;

import java.sql.*;
import java.util.List;

import controller.LoginController;
import model.DTORegister;

public class LoginDaoImp implements GenericDao {
	
	     //database connection 
	     DataBaseConnection dbc = new DataBaseConnection ();
	
        // DTOLogin dtobject;
	       LoginController conobject;
	     
	     //constructor to receive data from trainee 
	     public LoginDaoImp(String email , String password){
	    	 conobject = new LoginController (email,password);
			 findAll();
	     }
	     
	     
	     @Override
	     public  List <String> findAll(){
			
			/*
			String email = dtobject.getEmail(); 
			String password = dtobject.getPassword(); 
			String searchQuery = "select * from trainee where email='" + email + "' AND password='" + password + "'" ; 
			  
			try {
				
				Statement stmt=dbc.con.createStatement(); 
				ResultSet rs = stmt.executeQuery(searchQuery); 
				boolean traineeExists = rs.next(); 
				if (!traineeExists)  
				    System.out.println("Email/Password entered is Incorrect or trainee doesnot Exists."); 
				else{
					String firstName = rs.getString("firstName"); 
					String lastName = rs.getString("lastName"); 
					System.out.println("Welcome " + firstName + " " +lastName); 
					
				}
			}catch (Exception ex) 
				{ 
				System.out.println("Log In failed: An Exception has occurred! " + ex); 
				} 
				return dtobject; 
				*/
	    	 
	    	 return null;
				}  
			
	     @Override
	 	public List<String> findByID() {
	 		// TODO Auto-generated method stub
	 		return null;
	 	}
	     @Override
	 	public void insert() {
	     }
	     
	     @Override
	 	public void update(String t) {
	 		// TODO Auto-generated method stub
	 		
	 	}

	 	@Override
	 	public void delete(String t) {
	 		// TODO Auto-generated method stub
	 		
	 	}
	
}
    