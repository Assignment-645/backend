package com.hw3.com.Jersey_JPA_hibernate_backend;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
 
@Path("/students")
public class StudentController {

	
	@GET
	@Path("/all")
	@Produces("application/json")
	public List<Student> getstudents(){
		StudentResource sr = new StudentResource();
		//calling the resources method for getting all the list of students
		List<Student> s = sr.allstudentrecords();
		return s;
	}
	
	@POST
	@Path("/create")
	@Consumes("application/json")
	public void addStudent(Student s) {
		//Adding the student to records
		StudentResource sr = new StudentResource();
		sr.addingstudent(s);
		
	}
	
}
