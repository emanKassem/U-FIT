
package dao;

import java.sql.*;
import java.util.List;

import model.DTOgym;

public class LoginDaoImp implements GenericDao {
	     static Connection currentCon = null; 
	     static ResultSet rs = null; 
	     DTOgym dtobject;
	     @Override
	     public  DTOgym findAll(){
			int id ;
			Statement stmt = null; 
			String email = dtobject.getEmail(); 
			String password = dtobject.getPassword(); 
			String searchQuery = "select * from trainee where email='" + email + "' AND password='" + password + "'" ; 
			  
			try {
				//database connection 
				DataBaseConnection dbc = new DataBaseConnection ();
				stmt=currentCon.createStatement(); 
				rs = stmt.executeQuery(searchQuery); 
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
    