package fr.imie.jsfemanager.beans;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "mission", eager = true)
public class Mission {

	private long id;
	
	private long start;
	private long end;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public long getStart() {
		return start;
	}
	public void setStart(long start) {
		this.start = start;
	}
	public long getEnd() {
		return end;
	}
	public void setEnd(long end) {
		this.end = end;
	}

}
