package com.lambton;

import java.time.LocalDate;
import java.util.ArrayList;

public class Owner extends Person {
    private String companyTitle;
    private int businessLandLineNumber;
    private String website;
    private ArrayList<String> vehicleListOwned = new ArrayList<>();

    public void display(){

    }

    public Owner(){
        super();
    }

    public Owner( int Id, String firstName, String lastName, Gender gender, LocalDate birthDate,
                   int mobileNumber, String emailId, String userName,String password,
                   String companyTitle, int businessLandLineNumber, String website, ArrayList<String> vehicleListOwned){
        super(Id, firstName, lastName, gender, birthDate, mobileNumber, emailId, userName, password);
        this.companyTitle = companyTitle;
        this.businessLandLineNumber = businessLandLineNumber;
        this.website = website;
        this.vehicleListOwned = vehicleListOwned;
    }

    public String getCompanyTitle() {
        return companyTitle;
    }

    public void setCompanyTitle(String companyTitle) {
        this.companyTitle = companyTitle;
    }

    public int getBusinessLandLineNumber() {
        return businessLandLineNumber;
    }

    public void setBusinessLandLineNumber(int businessLandLineNumber) {
        this.businessLandLineNumber = businessLandLineNumber;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public ArrayList<String> getVehicleListOwned() {
        return vehicleListOwned;
    }

    public void setVehicleListOwned(ArrayList<String> vehicleListOwned) {
        this.vehicleListOwned = vehicleListOwned;
    }
}
