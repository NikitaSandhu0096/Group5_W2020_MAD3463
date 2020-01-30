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

    public Driver(){
        super();
    }

    public Driver(int Id, String firstName, String lastName, Gender gender, LocalDate birthDate,
                   int mobileNumber, String emailId, String userName, String password,
                   String drivingLicenceNumber, IsDrivingHistoryCleared isDrivingHistoryCleared){
        super(Id, firstName, lastName, gender, birthDate, mobileNumber, emailId, userName, password);
        this.drivingLicenceNumber = drivingLicenceNumber;
        this.isDrivingHistoryCleared = isDrivingHistoryCleared;
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
        return Salary;
    }

    public void setSalary(float salary) {
        Salary = salary;
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

    }
}
