package fr.imie.jsfemanager.beans;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "traising", eager = true)
public class Training {
	private long id;
	
	private String theme;
	private int duration;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
}
