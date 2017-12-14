
package dao;

import java.util.List;

import model.DTORegister;

public interface GenericDao  {

	
	//Read methods
	List <String>findAll();
	List <String> findByID();

	//Insert method 
	void insert() ;
	
	//update method 
	void update(String t);
	
	//delete method 
	void delete(String t);
	
	
	
}

