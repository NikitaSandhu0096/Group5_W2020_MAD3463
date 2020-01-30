package com.lambton;

import java.time.LocalDate;
import java.util.ArrayList;

public class Customer extends Person
{
    private String address;
    private String city;
    //private VehicleRent;

    public void display()
    {

    }

    public Customer(String address, String city, int Id, String firstName, String lastName, Gender gender, LocalDate birthDate,
                    int mobileNumber, String emailId, String userName,String password){
        this.address = address;
        this.city = city;
        this.Id = Id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.age = calculateStudentAge();
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
        this.userName = userName;
        this.password = password;
    }

    public int calculateStudentAge(){
        int age;
        LocalDate today = LocalDate.now();
        age = today.getYear() - birthDate.getYear();

        return age;
    }
}
