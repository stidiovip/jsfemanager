package fr.imie.jsfemanager.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "employee", eager = true)
public class Employee {
	
	private long id;
	private String firstname;
	private String lastname;
	private float salary;
	
	private Contact contact;
	private List<Mission> missions;
	private List<Training> trainings;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Contact getContact() {
		return contact;
	}
	
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
	public List<Mission> getMissions() {
		return missions;
	}
	
	public void setMissions(List<Mission> missions) {
		this.missions = missions;
	}
	
	public List<Training> getTrainings() {
		return trainings;
	}
	public void setTrainings(List<Training> trainings) {
		this.trainings = trainings;
	}

}
