package com.application.development.backendEDUCA.service;

import com.application.development.backendEDUCA.dto.GradeDTO;
import com.application.development.backendEDUCA.model.Grade;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GradeServiceTest {

    @Autowired
    private GradeService gradeService;

    //Get all grades
    @Test
    void getAllGrades() {
        this.gradeService.getAllGrades();
    }

    //Add grade
    @Test
    void addGrade() {
        Grade grade= new Grade();
        grade.setGradeID(4);
        grade.setGradeName("Grade 9");

        gradeService.addGrade(grade);

    }

    //Search by ID
    @Test
    void getGradeByID() {
        this.gradeService.getGradeByID(3);

    }

    //Search by name
    @Test
    void getGradeByName() {
        this.gradeService.getGradeByName("Grade 8");
    }


    //Save and update grade
    @Test
    void saveAndUpdateGrade() {
        GradeDTO gradeDTO= new GradeDTO();

        gradeDTO.setGradeID(2);
        gradeDTO.setGradeName("Grade 7");

        this.gradeService.saveAndUpdateGrade(gradeDTO);
    }


    //Delete grade
    @Test
    void deleteGradeByID() {
        this.gradeService.deleteGradeByID(6);

    }
}