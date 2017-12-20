package model;

import java.awt.Image;
import java.sql.Blob;

public class HomePageAdsDTO {
 
	private String post ;
	private String date ;
	private Blob image ;
	
	
	public HomePageAdsDTO() {
		// TODO Auto-generated constructor stub
	}

	//setters and getters
	public void setpost (String post)
	{
		this.post = post;
	}
	
	public String getpost()
	{
		return this.post;
	}
	
	public void setdate (String date)
	{
		this.date = date;
		
	}
	
	public String getdate()
	{
		return this.date;
	}
	
	public void setimage (Blob image)
	{
		this.image = image;
		
	}
	
	public Blob getimage()
	{
		return this.image;
	}
	
	
}
