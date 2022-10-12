package com.cg.dao;

import com.cg.entities.Student;

public interface StudentDao 
{
	//Interface Content all the method by default abstract method
	public abstract Student getStudentById(int rollno);
	public abstract void addStudent(Student s);
	public abstract void deleteStudent(Student s);
	public abstract void updateStudent(Student s);

	public abstract void beginTransaction();  //start the transaction
	public abstract void commitTransaction(); //End the transaction
	
}
