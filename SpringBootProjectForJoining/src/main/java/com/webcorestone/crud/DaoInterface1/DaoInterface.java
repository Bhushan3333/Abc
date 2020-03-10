package com.webcorestone.crud.DaoInterface1;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.webcorestone.crud.Model1.Student;


@Repository
public interface DaoInterface extends JpaRepository<Student, Integer>{

}
