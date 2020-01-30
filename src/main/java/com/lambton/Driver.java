package com.lambton;

import java.time.LocalDate;

enum IsDrivingHistoryCleared {
    YES,
    NO
}

public class Driver extends Person {
    private String drivingLicenceNumber;
    private IsDrivingHistoryCleared isDrivingHistoryCleared;
    private float Salary;

    public void display(){

    }

    public Driver(){
        super();
    }

    public Driver( int Id, String firstName, String lastName, Gender gender, LocalDate birthDate,
                   int mobileNumber, String emailId, String userName,String password,
                   String drivingLicenceNumber, IsDrivingHistoryCleared isDrivingHistoryCleared){
        super(Id, firstName, lastName, gender, birthDate, mobileNumber, emailId, userName, password);
        this.drivingLicenceNumber = drivingLicenceNumber;
        this.isDrivingHistoryCleared = isDrivingHistoryCleared;
    }

    @Override
    public int calculatePersonAge() {
        int age;
        LocalDate today = LocalDate.now();
        age = today.getYear() - birthDate.getYear();

        return age;
    }

    
}
