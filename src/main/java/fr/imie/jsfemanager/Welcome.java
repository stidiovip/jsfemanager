package fr.imie.jsfemanager;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

/**
 * 
 * @author Tidiane
 *
 */
@ManagedBean(name = "welcome", eager = true)
@RequestScoped
public class Welcome {
	
	// A bean to be injected
	@ManagedProperty(value = "#{welcomeMessage}")
	private WelcomeMessage welcomeMessageBean;
	
	// Simple attribute
	private String message;
	
	/**
	 * The constructor
	 */
	public Welcome (){
		
	}
	
	/**
	 * Gets the welcome message
	 * 
	 * @return
	 */
	public String getMessage (){
		
		if ( welcomeMessageBean != null){
			message = welcomeMessageBean.getMessage();
		}
		
		return message;
	}
	
	/**
	 * Sets the welcome message bean
	 * 
	 * @param welcomeMessageBean
	 */
	public void setWelcomeMessageBean(WelcomeMessage welcomeMessageBean) {
		this.welcomeMessageBean = welcomeMessageBean;
	}

}
