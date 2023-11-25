package com.application.development.backendEDUCA.dto;

import com.application.development.backendEDUCA.model.Grade;

public class GradeDTO {


    private Integer gradeID;
    private  String gradeName;

    public GradeDTO() {
    }

    public GradeDTO(Grade grade) {
        this.gradeID = grade.getGradeID();
        this.gradeName = grade.getGradeName();
    }

    public Integer getGradeID() {
        return gradeID;
    }

    public void setGradeID(Integer gradeID) {
        this.gradeID = gradeID;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }
}
