package com.viram.JPA;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Customer {
	@Id
	private int id;
	private String fName;
	private String lName;
	private long number;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private String email;
	@Override
	public String toString() {
		return "Customer [id=" + id + ", fName=" + fName + ", lName=" + lName + ", number=" + number + ", email="
				+ email + "]";
	}
	

}
