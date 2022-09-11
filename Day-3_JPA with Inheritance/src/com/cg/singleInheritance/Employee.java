package com.cg.singleInheritance;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
//@Inheritance annotation is used to get  Single Table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn annotation is used to get Single column
@DiscriminatorColumn(name="emp_type",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("emp")
public class Employee implements Serializable
{
	private static final long serialVersionUID = 1L;
	//@Id annotation is used as primary key 
	@Id
	//It is used to create ID automatically in MySQL
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int EmpId;
	private String name;
	private float salary;
	
	//getters and setters method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
}
