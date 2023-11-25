package com.application.development.backendEDUCA.dto;

import com.application.development.backendEDUCA.model.Subject;

public class SubjectDTO {
    private Integer subjectID;
    private String subjectName;

    public SubjectDTO() {
    }

    public SubjectDTO(Subject subject) {
        this.subjectID = subject.getSubjectID();
        this.subjectName = subject.getSubjectName();
    }

    public Integer getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(Integer subjectID) {
        this.subjectID = subjectID;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}
