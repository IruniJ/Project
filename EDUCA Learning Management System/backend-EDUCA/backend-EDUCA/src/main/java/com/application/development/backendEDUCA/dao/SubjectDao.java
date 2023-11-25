package com.application.development.backendEDUCA.dao;

import com.application.development.backendEDUCA.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubjectDao extends JpaRepository<Subject, Integer> {
    Subject findBySubjectID(Integer subjectID);


    Subject getBySubjectID(Integer subjectID);

    List<Subject> findBySubjectName(String subjectName);
}
