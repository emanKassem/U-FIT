package model;

public class Trainee {
	
	String email , password , address , firstName , lastName  ;
	Employee e = new Employee();
	public Employee getE() {
		return e;
	}
	public void setE(Employee e) {
		this.e = e;
	}
	Schedule s = new Schedule();
	public Schedule getS() {
		return s;
	}
	public void setS(Schedule s) {
		this.s = s;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	boolean active;
	
	
	
	
	

}
