package dao;

import java.util.List;

public interface GenericDao  {

	
	//Read methods
	List <String> findAll();
	List <String> findByID();

	//Insert method 
	boolean insert(String t) ;
	
	//update method 
	boolean update(String t);
	
	//delete method 
	boolean delete(String t);
	
	
	
}
