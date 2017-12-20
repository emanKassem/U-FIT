package controller;

import java.sql.SQLException;

import dao.HomePageDao;
import model.HomePageAdsDTO;
import services.HomePageResponseService;

public class HomePageController {

	public HomePageController ()
	{
		new HomePageDao ();
		
	}
	
	// method to call response service 
		public void callresponseService (HomePageAdsDTO dto) throws SQLException
		{
			new HomePageResponseService (dto);
		}
}
