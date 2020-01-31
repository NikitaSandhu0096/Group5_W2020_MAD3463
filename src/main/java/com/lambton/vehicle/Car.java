package com.lambton.vehicle;

import com.lambton.IDisplay;

import java.util.ArrayList;
import java.util.HashMap;

public  class Car extends Vehicle implements IDisplay
{

    private String carType ;
    private ArrayList<String> carColor = new ArrayList<> ();

    public Car()
    {
        super();
    }
    public  Car(String carType,ArrayList<String> carColor,int vehicleIdentificationNumber,String vehicleDescription,boolean vehicleIsSelfDrive,
                String vehicleManufacturerName,String vehicleDriverName, String vehicleInsuranceProviderName, int vehicleNoOfSeats, HashMap<String, Float> vehicleBaseRatePerDay,
                HashMap<String, Float> vehicleRatePerKm,boolean vehicleIsInsured,vehicleFuelType vehicleFuelType)
    {
        super(vehicleIdentificationNumber,vehicleDescription,vehicleIsSelfDrive,
                vehicleManufacturerName,vehicleDriverName,vehicleInsuranceProviderName,
                vehicleNoOfSeats,vehicleBaseRatePerDay,vehicleRatePerKm,vehicleIsInsured,vehicleFuelType);
        this.carType = carType;
        this.carColor = carColor;
    }


    public String getCarType()
    {
        return carType;
    }

    public void setCarType(String carType)
    {
        this.carType = carType;
    }

    public ArrayList<String> getCarColor()
    {
        return carColor;

    }


    public void setCarColor(ArrayList<String> carColor)
    {
        this.carColor = carColor;
    }

    @Override
        public void display()
        {
            System.out.println("Car's Identification Number : " + vehicleIdentificationNumber);
            System.out.println("Car's Description : "+vehicleDescription);
            System.out.println("Car's is self driving : "+vehicleIsSelfDrive);
            System.out.println("Car's Manufacturer's name : "+vehicleManufacturerName);
            System.out.println("Car's Driver Name : "+vehicleDriverName);
            System.out.println("Car's Insurance Provider's Name : "+vehicleInsuranceProviderName);
            System.out.println("Car's no. of seats : "+vehicleNoOfSeats);
            System.out.println("Car's Base Rate Per Day : "+vehicleBaseRatePerDay);
            System.out.println("Car's Rate per Hour : "+vehicleRatePerKm);
            System.out.println("Car's is Insured? : "+vehicleIsInsured);
            System.out.println("Car's Fuel Type : "+vehicleFuelType);
            System.out.println("Car's Type : "+carType);
            System.out.println("Car's Color : "+carColor);
        }

}
