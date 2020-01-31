package com.lambton.person;

import java.time.LocalDate;
import java.util.ArrayList;

public class Owner extends Person {
    private String companyTitle;
    private int businessLandLineNumber;
    private String website;
    private ArrayList<String> vehicleListOwned = new ArrayList<>();

    public Owner(){
        super();
    }

    public Owner(int Id, String firstName, String lastName, Gender gender, LocalDate birthDate,
                   int mobileNumber, String emailId, String userName, String password,
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
        System.out.println("Owner's Id : "+ Id);
        System.out.println("Owner's First Name : "+ firstName);
        System.out.println("Owner's Last Name : "+ lastName);
        System.out.println("Owner's Gender : "+ gender);
        System.out.println("Owner's Birth Date : "+ birthDate);
        System.out.println("Owner's Age : "+ age);
        System.out.println("Owner's Mobile Number : "+ mobileNumber);
        System.out.println("Owner's email Id : "+ emailId);
        System.out.println("Owner's User Name : "+ userName);
        System.out.println("Owner's Password : "+ password);
        System.out.println("Owner's Company Title : "+ companyTitle);
        System.out.println("Owner's Business and Landline Number : "+ businessLandLineNumber);
        System.out.println("Owner's website : "+website);
        System.out.println("Owner's Vehicle List Owned: "+vehicleListOwned);
    }
}
