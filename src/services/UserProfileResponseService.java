package services;

import java.sql.ResultSet;

import View.UserProfile;

public class UserProfileResponseService {

	public UserProfileResponseService(String firstname, String lastname, ResultSet rs) {

		UserProfile userProfile = new UserProfile();
		userProfile.response(firstname, lastname, rs);
		
	}

	
}
