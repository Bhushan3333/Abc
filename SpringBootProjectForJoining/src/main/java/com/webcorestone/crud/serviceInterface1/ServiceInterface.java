package com.webcorestone.crud.serviceInterface1;

import java.util.List;

import com.webcorestone.crud.Model1.Student;



public interface ServiceInterface {

	
	public void saveeData(Student stu);
	
	  public List<Student> getData();
     public Student editData(int id); 
	
	  public List<Student> updateData(Student stu); 
	  public String deleteData(int id);
	 
}
