package services;

import controller.LoginController;
import controller.LoginEmpController;

public class LoginEmpReqService {
	
	//constructor
	LoginEmpReqService (String email , String password)
	{
		
		sendToController(email,password);
		
	}

	//method to send data to controller 
    private void sendToController (String email, String password)
    {
       LoginEmpController lec = new LoginEmpController(email,password);
    }
	

}
