
package dao;

import java.util.List;

import model.DTOgym;

public interface GenericDao  {

	
	//Read methods
	DTOgym findAll();
	List <String> findByID();

	//Insert method 
	void insert() ;
	
	//update method 
	void update(String t);
	
	//delete method 
	void delete(String t);
	
	
	
}

