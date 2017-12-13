package services;

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
		
		/*RegisterationView v = new RegisterationView();
		v.checkMessage(message, email);*/
	}
}
