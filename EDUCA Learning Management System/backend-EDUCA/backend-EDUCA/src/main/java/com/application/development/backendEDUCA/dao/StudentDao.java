package com.application.development.backendEDUCA.dao;

import com.application.development.backendEDUCA.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDao extends JpaRepository<Student,Integer>{

    Student findByStudentID(Integer studentID);

    List<Student> findByStudentName(String studentName);

    Student getByStudentID(Integer studentID);


}
