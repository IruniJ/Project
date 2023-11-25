package com.application.development.backendEDUCA.controller;

import com.application.development.backendEDUCA.dto.StudentDTO;
import com.application.development.backendEDUCA.model.Student;
import com.application.development.backendEDUCA.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    //Get all student
    @RequestMapping(value = "/getAllStudents", method = RequestMethod.GET)
    public ResponseEntity<List<Student>> getAllStudents(){
        List<Student> students= this.studentService.getAllStudents();

        return new ResponseEntity<>(students, HttpStatus.OK);

    }

    @RequestMapping(value = "/getAllStudentWithSearch",method = RequestMethod.GET)
    public  ResponseEntity<List<StudentDTO>>getAllStudentWithSearch(){
        List<StudentDTO> students =this.studentService.getAllStudentWithSearch();

        return  new ResponseEntity<>(students,HttpStatus.OK);
    }

    //Add student
    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public  ResponseEntity<Student>addStudent(@RequestBody Student student){
        Student newStudent = this.studentService.addStudent(student);

        return new ResponseEntity<>(newStudent, HttpStatus.CREATED);
    }

    //Search by ID
    @RequestMapping(value = "/getStudentByID/{studentID}",method = RequestMethod.GET)
    public  ResponseEntity<Student>getStudentByID(@PathVariable Integer studentID){
        Student student= this.studentService.getStudentByID(studentID);

        return  new ResponseEntity<>(student,HttpStatus.OK);
    }

    //Search by name
    @RequestMapping(value = "/getStudentByName/{studentName}", method = RequestMethod.GET)
    public ResponseEntity<List<Student>>getStudentByName(@PathVariable String studentName){
        List<Student>students=this.studentService.getStudentsByName(studentName);

        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    //Save and Update student
    @RequestMapping(value = "/saveAndUpdateStudent", method = RequestMethod.POST)
    public ResponseEntity<StudentDTO>saveAndUpdateStudent(@RequestBody StudentDTO studentDTO){
      StudentDTO newStudent = this.studentService.saveAndUpdateStudent(studentDTO);

      return  new ResponseEntity<>(newStudent, HttpStatus.OK);
    }

    //Delete Student
    @DeleteMapping(value = "/deleteStudentByID/{studentID}")
    public boolean deleteStudentByID(@PathVariable Integer studentID){
        return studentService.deleteStudentByID(studentID);
    }
}
