package services;

import dao.AdminDao;

public class AdminRequestService {

	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String active ; 
	private int schedule ;
	
	
	public AdminRequestService (String firstName, String lastName, String email, String password , String active , int schedule )
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.active = active ;
		this.schedule = schedule ;
		callDao(firstName, lastName, email, password , active , schedule);
	}

	private void callDao(String firstName, String lastName, String email, String password ,String active , int schedule ) 
	{
	   //	AdminDao ad = new AdminDao(firstName,lastName, email, password,active,schedule);
	}
	
	
	
	
}
