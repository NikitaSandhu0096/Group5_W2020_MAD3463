package com.lambton.person;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.time.LocalDate;

public class Driver extends Person {
    private String drivingLicenceNumber;
    private boolean isDrivingHistoryCleared;
    private float salary;

    public Driver(){
        super();
    }

    public Driver(int Id, String firstName, String lastName, Gender gender, LocalDate birthDate,
                   int mobileNumber, String emailId, String userName, String password,
                   String drivingLicenceNumber, boolean isDrivingHistoryCleared,float salary){
        super(Id, firstName, lastName, gender, birthDate, mobileNumber, emailId, userName, password);
        this.drivingLicenceNumber = drivingLicenceNumber;
        this.isDrivingHistoryCleared = isDrivingHistoryCleared;
        this.salary= salary;
    }

    public String getDrivingLicenceNumber() {
        return drivingLicenceNumber;
    }

    public void setDrivingLicenceNumber(String drivingLicenceNumber) {
        this.drivingLicenceNumber = drivingLicenceNumber;
    }

    public boolean isDrivingHistoryCleared() {
        return isDrivingHistoryCleared;
    }

    public void setDrivingHistoryCleared(boolean drivingHistoryCleared) {
        isDrivingHistoryCleared = drivingHistoryCleared;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public int calculatePersonAge() {
        int age;
        LocalDate today = LocalDate.now();
        age = today.getYear() - birthDate.getYear();

        return age;
    }

    public void display()
    {
        System.out.println("Driver's Id : "+ Id);
        System.out.println("Driver's First Name : "+ firstName);
        System.out.println("Driver's Last Name : "+ lastName);
        System.out.println("Driver's Gender : "+ gender);
        System.out.println("Driver's Birth Date : "+ birthDate);
        System.out.println("Driver's Age : "+ age);
        System.out.println("Driver's Mobile Number : "+ mobileNumber);
        System.out.println("Driver's email Id : "+ emailId);
        System.out.println("Driver's User Name : "+ userName);
        System.out.println("Driver's Password : "+ password);
        System.out.println("DrivingLicenceNumber : "+ drivingLicenceNumber);
        System.out.println("IsDrivingHistoryCleared : "+ isDrivingHistoryCleared);
        System.out.println("DrivingLicenceNumber: "+ drivingLicenceNumber);
        System.out.println ("Salary : " + salary);
    }
}
