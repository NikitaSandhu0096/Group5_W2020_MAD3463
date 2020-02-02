package com.lambton.person;

import com.lambton.IDisplay;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.time.LocalDate;

//enum Gender {
//    MALE,
 //   FEMALE,
 //   OTHER
//}

public abstract class Person implements IDisplay {
    private int Id;
    private String firstName;
    private String lastName;
    private String gender;
    private LocalDate birthDate;
    private int age;
    private String mobileNumber;
    private String emailId;
    private String userName;
    private String password;

    public Person() {
        super();
    }

    public Person(int id, String firstName, String lastName, String gender, LocalDate birthDate, int age, String mobileNumber,
                  String emailId, String userName, String password) {
        super();
        Id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.age = age;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
        this.userName = userName;
        this.password = password;
    }



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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
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

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
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



    @Override
    public String toString() {
        return "Person [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
                + ", birthDate=" + birthDate + ", age=" + age + ", mobileNumber=" + mobileNumber + ", emailId="
                + emailId + ", userName=" + userName + ", password=" + password + "]";
    }

}
