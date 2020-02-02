package com.lambton.person;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.time.LocalDate;

public class Driver extends Person {
    private String drivingLicenceNumber;
    private boolean isDrivingHistoryCleared;
    private int salary;

    public Driver() {
        super();
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

    public void setDrivingHistoryCleared(boolean isDrivingHistoryCleared) {
        this.isDrivingHistoryCleared = isDrivingHistoryCleared;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }



    @Override
    public void display() {
        System.out.println("********************Displaying Driver Details********************");

        System.out.println("Driver [drivingLicenceNumber=" + drivingLicenceNumber + ", isDrivingHistoryCleared="
                + isDrivingHistoryCleared + ", salary=" + salary + ", id=" + getId() + ", firstName=" + getFirstName()
                + ", lastName=" + getLastName() + ", gender=" + getGender() + ", birthDate=" + getBirthDate()
                + ", age=" + getAge() + ", mobileNumber=" + getMobileNumber() + ", emailId=" + getEmailId()
                + ", userName=" + getUserName() + ", password=" + getPassword() + "]");

    }
}
