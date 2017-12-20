package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import controller.LoginController;
import model.DTOEmpLogin;
import model.DTOLogin;

public class LoginEmpDao implements GenericDao  {
	 //database connection 
    DataBaseConnection dbc = new DataBaseConnection ();

   // DTOLogin dtobject;
       DTOEmpLogin dtoLogin;
       
   //ControllerLogin
       LoginController lc = new LoginController();
      
    public LoginEmpDao() {};
    //constructor to receive data from employee
    public LoginEmpDao(String email , String password){
   	 dtoLogin = new DTOEmpLogin(email, password);
		 findAll();
    }
    
    
    @Override
    public  void findAll(){

   	 
		String searchQuery = "select * from employee where email='" + dtoLogin.getEmail() + "' AND password='" + dtoLogin.getPassword() + "'" ; 
		  
		try {
			
			Statement stmt=dbc.con.createStatement(); 
			ResultSet rs = stmt.executeQuery(searchQuery); 
			boolean empExists = rs.next(); 
			if (!empExists)  
			    lc.daoResponse("Email/Password entered is Incorrect or trainee doesnot Exists.", dtoLogin.getEmail()); 
			else{
			    lc.daoResponse("success", dtoLogin.getEmail());	
			}
		}catch (Exception ex) 
			{ 
			lc.daoResponse("Log In failed: An Exception has occurred! " + ex, dtoLogin.getEmail()); 
			} 

			
   	 
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

