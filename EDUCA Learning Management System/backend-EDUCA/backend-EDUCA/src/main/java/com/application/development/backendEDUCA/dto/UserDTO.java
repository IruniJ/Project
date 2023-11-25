package com.application.development.backendEDUCA.dto;

import com.application.development.backendEDUCA.model.User;

public class UserDTO {
    private Integer userID;
    private String userName;
    private String Password;
    private String status;

    public UserDTO() {
    }

    public UserDTO(User user) {
        this.userID = user.getUserID();
        this.userName = user.getUserName();
        this.Password = user.getPassword();
        this.status = user.getStatus();
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
