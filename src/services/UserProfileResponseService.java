package services;

import java.sql.ResultSet;

import View.UserProfile;

public class UserProfileResponseService {

	public UserProfileResponseService(String firstname, String lastname, ResultSet rs, ResultSet rs2) {

		UserProfile userProfile = new UserProfile();
		userProfile.response(firstname, lastname, rs, rs2);
		
	}

	
}
