package com.lutchobandeira.workinghours.model;

import java.util.Date;

public class TimeEntry {

	private long id;
	private Date time;
	
	public long getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Date getTime() {
		return time;
	}
	
	public void setTime(Date time) {
		this.time = time;
	}
	
}
