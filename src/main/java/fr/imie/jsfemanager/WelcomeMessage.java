package fr.imie.jsfemanager;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * 
 * @author Tidiane
 *
 */
@ManagedBean(name = "welcomeMessage", eager = true)
@RequestScoped
public class WelcomeMessage {
	private String message = "Welcome to JSF !";
	
	/**
	 * The message constructor
	 */
	public WelcomeMessage (){
		
	}
	
	/**
	 * Gets the message
	 * @return
	 */
	public String getMessage (){
		return message;
	}
	
	/**
	 * Sets the message
	 * @param message
	 */
	public void setMessage ( String message ){
		this.message = message;
	}
}
