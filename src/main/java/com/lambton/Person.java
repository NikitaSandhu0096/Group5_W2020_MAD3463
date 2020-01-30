package com.lambton;

import java.time.LocalDate;

enum Gender {
    MALE,
    FEMALE,
    OTHER
}

public abstract class Person implements IDisplay {
    protected int Id;
    protected String firstName;
    protected String lastName;
    protected Gender gender;
    protected LocalDate birthDate;
    protected int age;
    protected int mobileNumber;
    protected String emailId;
    protected String userName;
    protected String password;

    public abstract void display();

    public Person(){

    }

    public Person(int Id, String firstName, String lastName, Gender gender, LocalDate birthDate,
                  int mobileNumber, String emailId, String userName,String password){
        this.Id = Id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.age = calculatePersonAge();
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
        this.userName = userName;
        this.password = password;
    }

    public abstract int calculatePersonAge();

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
