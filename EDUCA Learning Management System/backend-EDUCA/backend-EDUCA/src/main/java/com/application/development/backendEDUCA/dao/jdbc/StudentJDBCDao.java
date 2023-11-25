package com.application.development.backendEDUCA.dao.jdbc;

import com.application.development.backendEDUCA.dto.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StudentJDBCDao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    public List<StudentDTO> getAllStudentWithSearch(){
        List<StudentDTO>result = new ArrayList<>();
        Map<String,Object> params = new HashMap<>();

        StringBuilder SQL = new StringBuilder();
        SQL.append("select                 /n");
        SQL.append("	ts.STUDENT_ID ,    /n");
        SQL.append("	ts.STUDENT_NAME ,  /n");
        SQL.append("	ts.ADDRESS ,       /n");
        SQL.append("	ts.CITY,           /n");
        SQL.append("	ts.GENDER ,        /n");
        SQL.append("	ts.AGE ,           /n");
        SQL.append("	ts.EMAIL ,         /n");
        SQL.append("	ts.MOBILE_NUMBER   /n");
        SQL.append("from                   /n");
        SQL.append("	student ts         /n");

        return namedParameterJdbcTemplate.query(SQL.toString(), params, new ResultSetExtractor<List<StudentDTO>>() {
            @Override
            public List<StudentDTO> extractData(ResultSet rs) throws SQLException, DataAccessException {
                while (rs.next()){
                   StudentDTO studentDTO = new StudentDTO();
                   studentDTO.setStudentID(rs.getInt("STUDENT_ID"));
                   studentDTO.setStudentName(rs.getString("STUDENT_NAME"));
                   studentDTO.setAddress(rs.getString("ADDRESS"));
                   studentDTO.setCity(rs.getString("CITY" ));
                   studentDTO.setGender(rs.getString("GENDER"));
                   studentDTO.setAge(rs.getInt("AGE"));
                   studentDTO.setEmail(rs.getString("EMAIL"));
                   studentDTO.setMobileNumber(rs.getString("MOBILE_NUMBER"));

                    result.add(studentDTO);

                }

                return result;
            }
        });
    }
}
