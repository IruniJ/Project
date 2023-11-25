package com.application.development.backendEDUCA.dao;

import com.application.development.backendEDUCA.model.Grade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GradeDao extends JpaRepository<Grade, Integer> {

    Grade findByGradeID(Integer gradeID);

    List<Grade> findByGradeName(String gradeName);

    Grade getByGradeID(Integer gradeID);
}
