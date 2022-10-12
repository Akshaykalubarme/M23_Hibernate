package com.cg.client;

import com.cg.entities.Student;
import com.cg.service.StudentService;
import com.cg.service.StudentServiceImpl;

public class Client 
{
	public static void main(String[] args) {
		
		StudentService service = new StudentServiceImpl();
		Student s = new Student();
		
//		//create operation
//		s.setRollno(103);
//		s.setName("Sagar");
//		service.addStudent(s); 
//		System.out.println("Data is added");
		
		//retrieve
		s=service.getStudentById(101);
		System.out.println("Student Roll No: "+s.getRollno());
		System.out.println("Student Roll No: "+s.getName()); 
		
//		//update
//		s=service.getStudentById(102);
//		s.setRollno(102);
//		s.setName("Amol");
//		service.updateStudent(s);
//		System.out.println("Data is updated");
	
//		//delete
//		s=service.getStudentById(103);
//		service.deleteStudent(s);
//		System.out.println("Data is deleted");
		
	}
}