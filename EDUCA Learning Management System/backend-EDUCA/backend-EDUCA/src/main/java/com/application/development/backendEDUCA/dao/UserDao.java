package com.application.development.backendEDUCA.dao;

import com.application.development.backendEDUCA.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {
    User findByUserNameAndPassword(String userName, String password);

}
