package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="people")
public class People {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer Id;
	@Column(name="firstname")
	private String firstName;
	
	@Column(name="lastname")
	private String lastname;
	@Column(name="email")
	private String Email;
	@Column(name="deptid")
	private Integer deptId;
	
public People() {
	// TODO Auto-generated constructor stub
}

public People(Integer id, String firstName, String lastname, String email, Integer deptId) {
	
	Id = id;
	this.firstName = firstName;
	this.lastname = lastname;
	Email = email;
	this.deptId = deptId;
}

public Integer getId() {
	return Id;
}

public void setId(Integer id) {
	Id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public String getEmail() {
	return Email;
}

public void setEmail(String email) {
	Email = email;
}

public Integer getDeptId() {
	return deptId;
}

public void setDeptId(Integer deptId) {
	this.deptId = deptId;
}
}
