
package dao;

import java.sql.PreparedStatement;
import java.util.List;

import controller.LoginController;
import model.DTOgym;


public class RegisterDaoImp implements GenericDao  {
 
	
	//database connection 
	DataBaseConnection dbc = new DataBaseConnection ();
	
	//DTO object 
	DTOgym dtobject ;

	//constructor
	public RegisterDaoImp (String firstname, String lastname, String password, String email) {
		
		 dtobject = new DTOgym (firstname,lastname,password,email);
		 insert();
		
		
	}

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
	public void insert() {
		String message ;
		String query = "insert into trainee (email,firstname,lastname,password,active) values (?,?,?,?,?)";
			try {
				
				PreparedStatement pstmt = dbc.con.prepareStatement(query);
				pstmt.setString(1, dtobject.getEmail());
				pstmt.setString(2, dtobject.getFirstName());
				pstmt.setString(3, dtobject.getLastName());
				pstmt.setString(4, dtobject.getPassword());
				pstmt.setString(5, "1");
				pstmt.executeUpdate();
				
				//controller message
				message="success";
		     }
		     catch (Exception e)
		     {
		    	 message="failed";
		    	 
		     }
			//registerController logcontroller =new registerController (dtobject.getEmail(),message);
		
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
