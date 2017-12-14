package services;

public class LoginRequestService {
	
	
	//constructor
	LoginRequestService (String email , String password)
	{
		
		sendToController(email,password);
		
	}

	//method to send data to controller 
    private void sendToController (String email, String password)
    {
    	//LoginController logcont = new LoginController(email,password);
    }
}
