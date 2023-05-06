package com.student.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentModel {
	@Id
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	private int roll;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}

}
