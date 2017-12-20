package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import model.DTOEmpLogin;



public class AdminDao implements GenericDao{
	
    //database connection 
    DataBaseConnection dbc = new DataBaseConnection ();

   //  DTOEmpLogin object;
    DTOEmpLogin dAdmin;
       
    //empty constructor 
    public AdminDao() {};
    
    //constructor to receive data from Admin 
    public AdminDao(String email , String password){
   	  DTOEmpLogin dAdmin = new  DTOEmpLogin(email, password);
		 
    }
	@Override
	public void findAll() {
		// TODO Auto-generated method stub
		
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
		try {
		Object selection = null;
		String textFieldSearch = null;
		String query = " Select firstname , lastname , schedule , email From Test where "+selection+" = ?"; 
		PreparedStatement pst = dbc.con.prepareStatement(query);
		pst.setString(1, textFieldSearch);
		ResultSet rs = pst.executeQuery();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
    
	
	
	
	
	
}
