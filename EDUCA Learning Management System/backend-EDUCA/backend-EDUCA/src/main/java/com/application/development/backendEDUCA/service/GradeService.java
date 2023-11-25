package com.application.development.backendEDUCA.service;

import com.application.development.backendEDUCA.dao.GradeDao;
import com.application.development.backendEDUCA.dto.GradeDTO;
import com.application.development.backendEDUCA.model.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class GradeService {

    @Autowired
    private GradeDao gradeDao;

    //Get all grades
    public List<Grade> getAllGrades(){
        List<Grade>grades = gradeDao.findAll();
        return grades;
    }

    //Add grade
    public Grade addGrade(Grade grade){
        Grade newGrade=this.gradeDao.saveAndFlush(grade);
        return  newGrade;
    }

    //Search by ID
    public Grade getGradeByID(Integer gradeID){
        return this.gradeDao.findByGradeID(gradeID);
    }

    //Search by name
    public List<Grade>getGradeByName(String gradeName){
        List<Grade> grades= this.gradeDao.findByGradeName(gradeName);
        return grades;
    }


    //Save and update grade
    public GradeDTO saveAndUpdateGrade(GradeDTO gradeDTO){
        Grade existingGrade= null;

        if(gradeDTO.getGradeID()!=null){
            existingGrade= gradeDao.findByGradeID(gradeDTO.getGradeID());
        }

        else {
            existingGrade= new Grade();
        }

        existingGrade.setGradeID(gradeDTO.getGradeID());
        existingGrade.setGradeName(gradeDTO.getGradeName());

        existingGrade= gradeDao.saveAndFlush(existingGrade);
        GradeDTO newGrade= new GradeDTO (existingGrade);

        return newGrade;

    }

    public boolean deleteGradeByID(Integer gradeID){
        Grade existingGrade= gradeDao.getByGradeID(gradeID);
        if( existingGrade != null){
            gradeDao.deleteById(gradeID);

            return true;
        }

        return false;
    }

}
