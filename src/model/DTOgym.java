package model;

public class DTOgym {
    private String firstName , lastName , password, email;

  
    public DTOgym (String firstname , String lastname, String password, String email)
    {
    	 this.firstName= firstname;
    	 this.lastName=lastname;
    	 this.password= password ;
    	 this.email=email;
    }
    
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
    
}
