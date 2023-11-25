package com.application.development.backendEDUCA.service;

import com.application.development.backendEDUCA.dao.SubjectDao;
import com.application.development.backendEDUCA.dto.SubjectDTO;
import com.application.development.backendEDUCA.model.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class SubjectService {

    @Autowired
    private SubjectDao subjectDao;

    //Get all subjects
    public List<Subject>getAllSubjects(){
        List<Subject>subjects= subjectDao.findAll();
        return subjects;
    }

    //Add subject
    public Subject addSubject(Subject subject){
        Subject newSubject= this.subjectDao.saveAndFlush(subject);
        return newSubject;
    }

    //Search by Subject ID
    public Subject getSubjectByID(Integer subjectID){

        return this.subjectDao.findBySubjectID(subjectID);

    }

    //Search by name
    public List<Subject>getSubjectByName(String subjectName){
        List<Subject>subjects= this.subjectDao.findBySubjectName(subjectName);
        return subjects;
    }

    //Save and Update subject
   public SubjectDTO saveAndUpdateSubject(SubjectDTO subjectDTO){
        Subject existingSubject=null;

        if(subjectDTO.getSubjectID()!=null){
            existingSubject=subjectDao.findBySubjectID(subjectDTO.getSubjectID());
        }
        else {
            existingSubject= new Subject();
        }

        existingSubject.setSubjectID(subjectDTO.getSubjectID());
        existingSubject.setSubjectName(subjectDTO.getSubjectName());

        existingSubject=subjectDao.saveAndFlush(existingSubject);
        SubjectDTO newSubjectDTO= new SubjectDTO(existingSubject);

        return newSubjectDTO;
   }

    //Delete subject
   public boolean deleteSubjectById(Integer subjectID){
        Subject existingSubject= subjectDao.getBySubjectID(subjectID);

        if(existingSubject != null){
            subjectDao.deleteById(subjectID);
            return true;
        }

        return false;
    }



}
