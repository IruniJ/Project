package com.application.development.backendEDUCA.dto;

import com.application.development.backendEDUCA.model.Student;

public class StudentDTO {

    private Integer studentID;
    private String studentName;
    private String address;
    private String city;
    private String gender;
    private Integer age;
    private String email;
    private String mobileNumber;
    private Integer subject_ID;
    private Integer grade_ID;

    public StudentDTO() {
    }

    public StudentDTO(Student student) {
        this.studentID = student.getStudentID();
        this.studentName = student.getStudentName();
        this.address = student.getAddress();
        this.city = student.getCity();
        this.gender = student.getGender();
        this.age = student.getAge();
        this.email = student.getEmail();
        this.mobileNumber = student.getMobileNumber();
    }

    public Integer getStudentID() {
        return studentID;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
