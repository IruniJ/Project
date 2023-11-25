package com.application.development.backendEDUCA.service;

import com.application.development.backendEDUCA.dto.StudentDTO;
import com.application.development.backendEDUCA.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentServiceTest {

    @Autowired
    private StudentService studentService;

    //Get all students
    @Test
    void getAllStudents() {
        this.studentService.getAllStudents();
    }


    //Add student
    @Test
    void addStudent() {
        Student student= new Student();

        student.setStudentID(8);
        student.setStudentName("Shashi Gunarathne");
        student.setAddress("Galewela Road, Galewela");
        student.setCity("Galewela");
        student.setGender("Female");
        student.setAge(21);
        student.setEmail("shashi89@gmail.com");
        student.setMobileNumber("0712343323");

        studentService.addStudent(student);
    }

    //Search by ID
    @Test
    void getStudentByID() {
        this.studentService.getStudentByID(3);
    }

    //Search by name
    @Test
    void getStudentsByName() {
        this.studentService.getStudentsByName("Kasuni");
    }

    //Save and update subject
    @Test
    void saveAndUpdateStudent() {
        StudentDTO studentDTO= new StudentDTO();

        studentDTO.setStudentID(7);
        studentDTO.setStudentName("Sihina Wijethunge");
        studentDTO.setAddress("Horape Road, Ragama");
        studentDTO.setCity("Ragama");
        studentDTO.setGender("Male");
        studentDTO.setAge(14);
        studentDTO.setEmail("sihi@gmail.com");
        studentDTO.setMobileNumber("0773424312");

        this.studentService.saveAndUpdateStudent(studentDTO);
    }

    //Delete subject
    @Test
    void deleteStudentByID() {
       this.studentService.deleteStudentByID(16);
    }


}