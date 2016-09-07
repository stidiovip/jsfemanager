package fr.imie.jsfemanager;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "welcome", eager = true)
public class Welcome {
	
	private String welcome = " Welcome to JSF !";
	
	/**
	 * The constructor
	 */
	public Welcome (){
		
	}
	
	/**
	 * Get the welcome message
	 * @return
	 */
	public String getMessage (){
		return welcome;
	}
}
