package com.application.development.backendEDUCA.service;

import com.application.development.backendEDUCA.dto.SubjectDTO;
import com.application.development.backendEDUCA.model.Subject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SubjectServiceTest {

    @Autowired
    private SubjectService subjectService;

    //Get all subjects
    @Test
    void getAllSubjects() {
        this.subjectService.getAllSubjects();
    }

    //Add subjects
    @Test
    void addSubject() {
        Subject subject= new Subject();

        subject.setSubjectID(5);
        subject.setSubjectName("History");

        subjectService.addSubject(subject);
    }

    //Get subject by ID
    @Test
    void getSubjectByID() {
        this.subjectService.getSubjectByID(2);
    }

    //Save and update subject
    @Test
    void saveAndUpdateSubject() {
        SubjectDTO subjectDTO= new SubjectDTO();

        subjectDTO.setSubjectID(4);
        subjectDTO.setSubjectName(" LIT");

        this.subjectService.saveAndUpdateSubject(subjectDTO);
    }

    //Delete Subject
    @Test
    void deleteSubjectById() {
        this.subjectService.deleteSubjectById(5);
    }

    //Search by name
    @Test
    void getSubjectByName() {
        this.subjectService.getSubjectByName("Science");
    }
}