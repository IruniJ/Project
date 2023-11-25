package com.application.development.backendEDUCA.service;

import com.application.development.backendEDUCA.dao.StudentDao;
import com.application.development.backendEDUCA.dao.jdbc.StudentJDBCDao;
import com.application.development.backendEDUCA.dto.StudentDTO;
import com.application.development.backendEDUCA.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    @Autowired
    private StudentJDBCDao studentJDBCDao;

    //Get all students
    public List<Student>getAllStudents(){
        List<Student>students = studentDao.findAll();
        return students;
    }


    public List<StudentDTO>getAllStudentWithSearch(){
    List<StudentDTO> studentDTOS= this.studentJDBCDao.getAllStudentWithSearch();
    return studentDTOS;
    }


    //Add students
    public Student addStudent(Student student){
        Student newStudent = this.studentDao.saveAndFlush(student);
        return newStudent;
    }

    //Search student by ID
    public Student getStudentByID(Integer studentID){
        return this.studentDao.findByStudentID(studentID);
    }

    //Search by name
    public List<Student>getStudentsByName(String studentName){
    List<Student> students= this.studentDao.findByStudentName(studentName);
    return students;
    }

    //Save and Update student
    public StudentDTO saveAndUpdateStudent(StudentDTO studentDTO){
        Student student = null;

        if(studentDTO.getStudentID() !=null){
            student=this.studentDao.getByStudentID(studentDTO.getStudentID());      }
        else {
            student = new Student();
        }


        student.setStudentName((studentDTO.getStudentName()));
        student.setAddress(studentDTO.getAddress());
        student.setCity(studentDTO.getCity());
        student.setGender(studentDTO.getGender());
        student.setAge(studentDTO.getAge());
        student.setEmail(studentDTO.getEmail());
        student.setMobileNumber(studentDTO.getMobileNumber());

        student= studentDao.saveAndFlush(student);
        StudentDTO newStudentDTO = new StudentDTO(student);

        return newStudentDTO;
    }



    //Delete student
    public boolean deleteStudentByID(Integer studentID){
        Student existingStudent = studentDao.getByStudentID(studentID);
        if(existingStudent!= null){
            studentDao.deleteById((studentID));
            return true;
        }else {
            return false;
        }
    }
}
