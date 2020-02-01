package com.lambton.person;

import com.lambton.IDisplay;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
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

    public String encryptPassword(String p){
        try{
            String key1 = "KEY123KEY456";
            Key aesKey1 = new SecretKeySpec(key1.getBytes(),"AES");
            Cipher c1 = Cipher.getInstance("AES");
            c1.init(Cipher.ENCRYPT_MODE,aesKey1);
            byte[] encryted1 = c1.doFinal(p.getBytes());
            System.out.println(new String (encryted1));
        }catch (Exception e){
            e.printStackTrace();
        }
        return new String();
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
            try{
                String key1 = "KEY123KEY456";
                Key aesKey1 = new SecretKeySpec (key1.getBytes(),"AES");
                Cipher c1 = Cipher.getInstance("AES");
                c1.init(Cipher.DECRYPT_MODE,aesKey1);
                String dencryted1 = new String (c1.doFinal(encrypted);
                System.out.println(new String (dencryted1));
            }catch (Exception e){
                e.printStackTrace();
            }
            return new String();
        }
    }
}
