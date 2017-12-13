package dao;

import java.sql.PreparedStatement;
import java.util.List;


public class RegisterDaoImp implements GenericDao  {
    //Data attributes 
	 private String firstName , lastName , password, email; 
	
	//database connection 
	DataBaseConnection dbc = new DataBaseConnection ();

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
		// TODO Auto-generated method stub
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
	
	//constructor 
	RegisterDaoImp 

	
	
	
	

}
