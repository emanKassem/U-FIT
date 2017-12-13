package services;

public class RegisterationServiceRequest {

	private String firstName;
	private String lastName;
	private String email;
	private String password;
	
	public RegisterationServiceRequest(String firstName, String lastName, String email, String password)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		
		callController(firstName, lastName, email, password);
	}

	private void callController(String firstName, String lastName, String email, String password) 
	{
		//RegisterationController c = new RegisterationController(firstName,lastName, email, password);
	}
}
