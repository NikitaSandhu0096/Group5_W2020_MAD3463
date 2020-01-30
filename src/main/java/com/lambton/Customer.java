package com.lambton;

import java.time.LocalDate;
import java.util.ArrayList;

public class Customer extends Person
{
    private String address;
    private String city;
    //private VehicleRent;

    public Customer(){
        super();
    }

    public Customer( int Id, String firstName, String lastName, Gender gender, LocalDate birthDate,
                    int mobileNumber, String emailId, String userName,String password, String address, String city){
        super(Id, firstName, lastName, gender, birthDate, mobileNumber, emailId, userName, password);
        this.address = address;
        this.city = city;
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

    @Override
    public int calculatePersonAge(){
        int age;
        LocalDate today = LocalDate.now();
        age = today.getYear() - birthDate.getYear();

        return age;
    }

    public void display()
    {

    }
}
