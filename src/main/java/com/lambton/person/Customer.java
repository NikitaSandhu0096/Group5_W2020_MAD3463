package com.lambton.person;

import com.lambton.VehicleRent;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.time.LocalDate;
import java.util.ArrayList;

public class Customer extends Person
{
    VehicleRent vr;

    private String address;
    private String city;
    ArrayList<VehicleRent> vehicleRent = new ArrayList<>();


    public Customer(){
        super();
    }

    public Customer(int Id, String firstName, String lastName, Gender gender, LocalDate birthDate,
                    int mobileNumber, String emailId, String userName, String password, String address, String city){
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
        System.out.println("Customer's Id : "+ Id);
        System.out.println("Customer's First Name : "+ firstName);
        System.out.println("Customer's Last Name : "+ lastName);
        System.out.println("Customer's Gender : "+ gender);
        System.out.println("Customer's Birth Date : "+ birthDate);
        System.out.println("Customer's Age : "+ age);
        System.out.println("Customer's Mobile Number : "+ mobileNumber);
        System.out.println("Customer's email Id : "+ emailId);
        System.out.println("Customer's User Name : "+ userName);
        System.out.println("Customer's Password : "+ password);
        System.out.println("Customer's Address : "+ address);
        System.out.println("Customer's City : "+ city);
    }


}
