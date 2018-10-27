package com.todo.server.todoserver.repository;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Todo {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String todoDes;
	
	private String userName;
	
	private Date targetDate;
	
	private boolean isDone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTodoDes() {
		return todoDes;
	}

	public void setTodoDes(String todoDes) {
		this.todoDes = todoDes;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}

	public boolean isDone() {
		return isDone;
	}

	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}
	
}
