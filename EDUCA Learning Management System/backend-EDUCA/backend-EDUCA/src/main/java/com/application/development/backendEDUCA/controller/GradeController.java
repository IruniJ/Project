package com.application.development.backendEDUCA.controller;

import com.application.development.backendEDUCA.dto.GradeDTO;
import com.application.development.backendEDUCA.model.Grade;
import com.application.development.backendEDUCA.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grade")
public class GradeController {

    @Autowired
    private GradeService gradeService;

    //Get all grades
    @RequestMapping(value = "/getAllGrades", method = RequestMethod.GET)
    public ResponseEntity<List<Grade>>getAllGrades(){
        List<Grade> grades= this.gradeService.getAllGrades();

        return new  ResponseEntity<>(grades, HttpStatus.OK);

    }

    //Add grade
    @RequestMapping(value = "/addGrade",method = RequestMethod.POST)
    public ResponseEntity<Grade>addGrade(@RequestBody Grade grade){
        Grade newGrade=this.gradeService.addGrade(grade);

        return new ResponseEntity<>(newGrade, HttpStatus.CREATED);
    }

    //Search by ID
    @RequestMapping(value = "/getStudentByID{gradeID}", method = RequestMethod.GET)
    public ResponseEntity<Grade>getGradeByID(@PathVariable Integer gradeID){
        Grade grade= this.gradeService.getGradeByID(gradeID);

        return new ResponseEntity<>(grade,HttpStatus.OK);
    }

    //Search by name
    @RequestMapping(value = "/getGradeByName{gradeName}", method = RequestMethod.GET)
    public  ResponseEntity<List<Grade>>getGradeByName(@PathVariable String gradeName){
        List<Grade>grades = this.gradeService.getGradeByName(gradeName);

        return new ResponseEntity<>(grades,HttpStatus.OK);


    }

    //save and update grade
    @RequestMapping(value = "/saveAndUpdateGrade",method = RequestMethod.POST)
    public ResponseEntity<GradeDTO>saveAndUpdateGrade(@RequestBody GradeDTO gradeDTO){
        GradeDTO newGrade= this.gradeService.saveAndUpdateGrade(gradeDTO);

        return new ResponseEntity<>(newGrade,HttpStatus.OK);
    }

    //Delete grade
    @DeleteMapping(value = "/deleteGradeByID/{gradeID}")
    public boolean deleteGradeByID(@PathVariable Integer gradeID){
        return gradeService.deleteGradeByID(7);
    }

}
