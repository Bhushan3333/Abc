package com.webcorestone.crud.ServiceImp1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcorestone.crud.DaoInterface1.DaoInterface;
import com.webcorestone.crud.Model1.Student;
import com.webcorestone.crud.serviceInterface1.ServiceInterface;

@Service
public class ServiceImpl implements ServiceInterface {

	@Autowired
	private DaoInterface di;

	@Override
	public void saveeData(Student stu) {
		di.save(stu);

	}

	@Override
	public List<Student> getData() {
		List<Student> list = di.findAll();
		return list;
	}

	@Override
	public Student editData(int id) {
		Student s = di.findById(id).get();
		return s;
	}

	@Override
	public List<Student> updateData(Student stu) {
		List<Student> list = di.findAll();
		di.save(stu);

		return list;
	}

	@Override
	public String deleteData(int id) {
		di.deleteById(id);
		return "delete data";
	}

}
