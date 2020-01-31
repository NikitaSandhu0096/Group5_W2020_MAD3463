package com.lambton.person;

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

    @Override
    public String encryptPassword(String p) {

        if(p.length()<2){
            System.out.println("String only has one character");
        }
        else{
            if(p.length()%2==0){
                char[] ch1 = p.toCharArray();
                int length = p.length();
                for(int i = 0; i<length;i+=2){
                    char t1 = ch1[i];
                    ch1[i] = ch1[i+1];
                    ch1[i+1] = t1;
                }
                return new String(ch1);
            }
            else {
                char[] ch1 = p.toCharArray();
                int length = p.length();
                char t2 = ch1[length-1];
                for(int i = 0; i<length-1;i+=2){
                    char t1 = ch1[i];
                    ch1[i] = ch1[i+1];
                    ch1[i+1] = t1;
                }

                for(int j =length-1; j>length/2;j--){
                    char t3 = ch1[j];
                    ch1[j] = ch1[j-1];
                    ch1[j-1] = t3;
                }

                ch1[length/2]=t2;
                return new String(ch1);
            }
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
