package controller;

import java.sql.ResultSet;

import dao.UserProfileDao;
import services.UserProfileResponseService;

public class UserProfileController {

	public UserProfileController() {};
	
	public UserProfileController(String email) {
		new UserProfileDao(email);
	}
	
	public void requestFromDao(String firstname, String lastname, ResultSet rs) {
		new UserProfileResponseService(firstname, lastname, rs);
	}
}
