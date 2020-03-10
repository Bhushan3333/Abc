package com.webcorestone.crud.controller1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webcorestone.crud.Model1.Student;
import com.webcorestone.crud.serviceInterface1.ServiceInterface;



@RestController
@RequestMapping("/da")
public class HomeController {
	
	@Autowired
  private	ServiceInterface si;

	@PostMapping("/dis")
	public String display(@RequestBody Student student )
	{ 
		si.saveeData(student);
		
		return "Save Data";
	}
	
	@GetMapping("/getdata")
	public List<Student> getAll()
	{
		
	List<Student> list=	 si.getData();
		return list;
		
	}
	@GetMapping("/edit/{id}")
   public Student editId(@PathVariable int id) {
	   Student stu=   si.editData(id);
	return stu;
}
	
	@PutMapping("/up")
	public List<Student> updateData(@RequestBody Student stu) {
		List<Student> list=si.updateData(stu);
	
		
		return list;
	}
	
	@DeleteMapping("/del/{id}")
	public String deleteData(@PathVariable int id)
	{
	     si.deleteData(id);
		return "dalete";
	}
}
