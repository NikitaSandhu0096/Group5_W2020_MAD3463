package com.lambton;

import java.time.LocalDate;

enum IsDrivingHistoryCleared {
    YES,
    NO
}

public class Driver extends Person {
    private String drivingLicenceNumber;
    private IsDrivingHistoryCleared isDrivingHistoryCleared;
    private float salary;

    public Driver(){
        super();
    }

    public Driver(int Id, String firstName, String lastName, Gender gender, LocalDate birthDate,
                   int mobileNumber, String emailId, String userName, String password,
                   String drivingLicenceNumber, IsDrivingHistoryCleared isDrivingHistoryCleared, float salary){
        super(Id, firstName, lastName, gender, birthDate, mobileNumber, emailId, userName, password);
        this.drivingLicenceNumber = drivingLicenceNumber;
        this.isDrivingHistoryCleared = isDrivingHistoryCleared;
        this.salary = salary;
    }

    public String getDrivingLicenceNumber() {
        return drivingLicenceNumber;
    }

    public void setDrivingLicenceNumber(String drivingLicenceNumber) {
        this.drivingLicenceNumber = drivingLicenceNumber;
    }

    public IsDrivingHistoryCleared getIsDrivingHistoryCleared() {
        return isDrivingHistoryCleared;
    }

    public void setIsDrivingHistoryCleared(IsDrivingHistoryCleared isDrivingHistoryCleared) {
        this.isDrivingHistoryCleared = isDrivingHistoryCleared;
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
        System.out.println("Customer's First Name : "+ firstName);
        System.out.println("Customer's Last Name : "+ lastName);
        System.out.println("Customer's Gender : "+ gender);
        System.out.println("Customer's Birth Date : "+ birthDate);
        System.out.println("Customer's Age : "+ age);
        System.out.println("Customer's Mobile Number : "+ mobileNumber);
        System.out.println("Customer's email Id : "+ emailId);
        System.out.println("Customer's User Name : "+ userName);
        System.out.println("Customer's Password : "+ password);
        System.out.println("Customer's Address : "+ drivingLicenceNumber);
        System.out.println("Customer's City : "+ isDrivingHistoryCleared);
        System.out.println("Customer's City : "+ salary);
    }
}
