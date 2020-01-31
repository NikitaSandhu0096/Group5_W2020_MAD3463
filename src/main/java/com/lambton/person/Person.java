package com.lambton.person;

import com.lambton.IDisplay;

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

    public Person() {
    }

    public abstract void display();

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
        this.password = encryptPassword(password);
    }

    public abstract int calculatePersonAge();

    public abstract String encryptPassword(String p);

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
        return decryptPassword(password);
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String decryptPassword(String p) {
            if(p.length()<2){
                System.out.println("String only has one character");
            }
            else{
                if(p.length()%2==0){
                    char[] ch1 = p.toCharArray();
                    int length = p.length();
                    for(int i = 0; i<length;i+=2){
                        char t1 = ch1[i];
                        ch1[i] = ch1[i+1];
                        ch1[i+1] = t1;
                    }
                    return new String(ch1);
                }
                else {
                    char[] ch1 = p.toCharArray();
                    int length = p.length();
                    char t2 = ch1[length/2];
                    for(int j =length-1; j>length/2;j--){
                        char t3 = ch1[j];
                        ch1[j] = ch1[j-1];
                        ch1[j-1] = t3;
                    }
                    ch1[length-1]=t2;
                    for(int i = 0; i<length-1;i+=2){
                        char t1 = ch1[i];
                        ch1[i] = ch1[i+1];
                        ch1[i+1] = t1;
                    }
                    return new String(ch1);
                }
            }
            return new String();
        }
}
