package dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import controller.HomePageController;
import model.HomePageAdsDTO;

public class HomePageDao implements GenericDao {
	

	//DataBase connection 
	DataBaseConnection db = new DataBaseConnection ();
	
	// DTO object 
	HomePageAdsDTO dto = new HomePageAdsDTO  ();
	
	//controller object 
	 HomePageController controller = new  HomePageController();
	

	@Override
	public void findAll() {
		
		String message ;
		String query = "select date, data, image from ads order by id , desc" ;
		
		try {
		    	
			java.sql.Statement stmt = db.con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next())
			{
				dto.setdate(rs.getString("date"));
				dto.setpost(rs.getString("data"));
				dto.setimage(rs.getBlob("image"));
				
			    rs = stmt.executeQuery(query);
			    controller.callresponseService(dto);
			}
			
			stmt.close();
	     	}catch (Exception e )
		{
	     		
	     		message = "no posts found";
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

	
}
