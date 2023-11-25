package com.application.development.backendEDUCA.controller;

import com.application.development.backendEDUCA.dto.SubjectDTO;
import com.application.development.backendEDUCA.model.Subject;
import com.application.development.backendEDUCA.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subject")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    //Get all subjects
    @RequestMapping(value = "/getAllSubjects",method = RequestMethod.GET)
    public ResponseEntity<List<Subject>>getAllSubjects(){
        List<Subject> subjects= this.subjectService.getAllSubjects();

        return new ResponseEntity<>(subjects, HttpStatus.OK);

    }

    //Add subject
    @RequestMapping(value = "/addSubject",method = RequestMethod.POST)
    public ResponseEntity<Subject>addSubject(@RequestBody Subject subject){
        Subject newSubject= this.subjectService.addSubject(subject);

        return new ResponseEntity<>(newSubject, HttpStatus.CREATED);
    }

    //Search by ID
    @RequestMapping(value = "/getSubjectByID/{subjectID}",method = RequestMethod.GET)
    public ResponseEntity<Subject>getSubjectByID(@PathVariable Integer subjectID){
        Subject subject= this.subjectService.getSubjectByID(subjectID);

        return  new ResponseEntity<>(subject, HttpStatus.OK);
    }

    //Search by name
    @RequestMapping(value = "/getSubjectByName/{subjectName}", method = RequestMethod.GET)
    public ResponseEntity<List<Subject>>getSubjectByName(@PathVariable String subjectName){
        List<Subject>subjects= this.subjectService.getSubjectByName(subjectName);

        return new ResponseEntity<>(subjects, HttpStatus.OK);
    }

    //Save and update subject
    @RequestMapping(value = "/saveAndUpdateSubject",method = RequestMethod.POST)
    public  ResponseEntity<SubjectDTO>saveAndUpdateSubject(@RequestBody SubjectDTO subjectDTO){
        SubjectDTO newSubject= this.subjectService.saveAndUpdateSubject(subjectDTO);

        return new ResponseEntity<>(newSubject,HttpStatus.OK);
    }

    //Delete subject
    @DeleteMapping(value = "/deleteSubjectByID/{subjectID}")
    public boolean deleteSubjectByID(@PathVariable Integer subjectID){
        return subjectService.deleteSubjectById(subjectID);
    }


}
