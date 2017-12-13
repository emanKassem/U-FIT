package dao;

import java.sql.PreparedStatement;
import java.util.List;

import model.DTOgym;


public class RegisterDaoImp implements GenericDao  {
    //Data attributes 
	 private String firstName , lastName , password, email; 
	
	//database connection 
	DataBaseConnection dbc = new DataBaseConnection ();
	
	//constructor
	public RegisterDaoImp (String firstname, String lastname, String password, String email) {
		this.firstName = firstname ;
		this.lastName = lastname ;
		this.password = password ;
		this.email =email;
	}
	
	//DTO object 
	DTOgym dtobject = new DTOgym (firstName,lastName,password,email);

	@Override
	public List<String> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> findByID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(String t) {
		
		
        String query= "INSERT INTO trainee (email, firstname, lastname, password) VALUES (?, ?, ?, ?)";
     try {
        PreparedStatement pstmt = dbc.con.prepareStatement(query);
        
        pstmt.setString(1,dtobject.getEmail());
        pstmt.setString(2, dtobject.getFirstName());
        pstmt.setString(3, dtobject.getLastName());
        pstmt.setString(4, dtobject.getPassword());
        
        pstmt.executeQuery();
     }
     catch (Exception e)
     {
    	 e.printStackTrace();
     }
		return false;
	}

	@Override
	public boolean update(String t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String t) {
		// TODO Auto-generated method stub
		return false;
	}
}
	
	

	
	
	
	


