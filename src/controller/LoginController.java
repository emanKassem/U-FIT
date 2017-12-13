package controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginController {
	
	private String email, password;
	static int active = 0;
	
	public LoginController(String email, String password) {
		this.email = email;
		this.password = password;
		
		checkValidation(email, password);
	}

	private void checkValidation(String email, String password) {
		Pattern pattern = Pattern.compile("^.+@.+\\..+$");
		Matcher matcher = pattern.matcher(email);
		boolean b = matcher.matches();
		if(b == true) {
			if(password != null) {
				
				//LoginDao ld = new LoginDao(email, password);
			}
		}else {
			
			/*LoginView lv = new LoginView();
			lv.checkMessage("please Enter valid email", email);*/
		}
		
	}
	
	public void daoResponse(String message, String email) {
		if(message == "success") {
			/*LoginView lv = new LoginView();
			lv.checkMessage(message, email);*/
		}else {
			active--;
			if(active == 0) {
				//LoginDao.daoActive(0, email);
				active = 3;
			}			
			/*LoginView lv = new LoginView();
			lv.checkMessage(message, email);*/
		}
	}
}
