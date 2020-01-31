package com.lambton.person;

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
                   String drivingLicenceNumber, IsDrivingHistoryCleared isDrivingHistoryCleared,float salary){
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

    public IsDrivingHistoryCleared getIsDrivingHistoryCleared() {
        return isDrivingHistoryCleared;
    }

    public void setIsDrivingHistoryCleared(IsDrivingHistoryCleared isDrivingHistoryCleared) {
        this.isDrivingHistoryCleared = isDrivingHistoryCleared;
    }

    public float getsalary() {
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

    @Override
    public String encryptPassword(String p) {
        char[] ch = p.toCharArray();
        int length = p.length();
        for(int i=0, j=length-1; i<length;i++, j--) {
            char c = ch[i];
            ch[i] = ch[j];
            ch[j] = c;
        }
        return new String();
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
