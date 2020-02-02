package com.lambton.person;

import com.lambton.vehicle.Vehicle;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Owner extends Person {
    private String companyTitle;
    private String businessLandLineNumber;
    private String website;
    private List<Vehicle> vehicles;

    public Owner() {
        super();
        // TODO Auto-generated constructor stub
    }

    public String getCompanyTitle() {
        return companyTitle;
    }
    public void setCompanyTitle(String companyTitle) {
        this.companyTitle = companyTitle;
    }
    public String getBusinessLandLineNumber() {
        return businessLandLineNumber;
    }
    public void setBusinessLandLineNumber(String businessLandLineNumber) {
        this.businessLandLineNumber = businessLandLineNumber;
    }
    public String getWebsite() {
        return website;
    }
    public void setWebsite(String website) {
        this.website = website;
    }
    public List<Vehicle> getVehicles() {
        return vehicles;
    }
    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public String toString() {
        return "Owner [companyTitle=" + companyTitle + ", businessLandLineNumber=" + businessLandLineNumber
                + ", website=" + website + ", vehicles=" + vehicles + ", id=" + getId() + ", firstName()="
                + getFirstName() + ", lastName()=" + getLastName() + ", gender()=" + getGender()
                + ", birthDate()=" + getBirthDate() + ", age()=" + getAge() + ", mobileNumber()="
                + getMobileNumber() + ", emailId()=" + getEmailId() + ", userName()=" + getUserName()
                + ", password()=" + getPassword() +  "]";
    }


    @Override
    public void display() {
        System.out.println("********************Displaying Owner Details********************");

        System.out.println("Owner [companyTitle=" + companyTitle + ", businessLandLineNumber=" + businessLandLineNumber
                + ", website=" + website + ", id=" + getId() + ", firstName="
                + getFirstName() + ", lastName=" + getLastName() + ", gender=" + getGender()
                + ", birthDate=" + getBirthDate() + ", age=" + getAge() + ", mobileNumber="
                + getMobileNumber() + ", emailId=" + getEmailId() + ", userName=" + getUserName()
                + ", password=" + getPassword() +  "]");

    }
}
