package com.lambton.person;

import java.time.LocalDate;

public class Customer extends Person
{
    private String address;
    private String city;
    //private VehicleRent;

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

    @Override
    public String calculatePassword(String p) {
        char[] ch = p.toCharArray();
        int length = p.length();
        for(int i=0; i<length;i++){
            System.out.println("*");
        }
        return new String();
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
