package services;

import View.RegisterationPage;

public class RegisterationServiceResponse {
	
	private String message;
	private String email;
	
	public RegisterationServiceResponse(String message, String email) 
	{
		this.message = message;
		this.email = email;
		
		sendToView(message, email);
	}

	private void sendToView(String message, String email) {
		
		RegisterationPage v = new RegisterationPage();
		v.response(message, email); 
	}
}
