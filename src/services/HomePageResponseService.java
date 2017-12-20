package services;

import View.HomePage;
import model.HomePageAdsDTO;

public class HomePageResponseService {
	
	public HomePageResponseService (HomePageAdsDTO dto)
	{
		 new HomePage (dto);
	}

}
