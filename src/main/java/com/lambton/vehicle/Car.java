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
    public  Car(String carType,ArrayList<String> carColor,int vehicleIdentificationNumber,String vehicleDescription,vehicleIsSelfDrive vehicleIsSelfDrive,
                String vehicleManufacturerName,String vehicleDriverName, String vehicleInsuranceProviderName, int vehicleNoOfSeats, HashMap<String, Float> vehicleBaseRatePerDay,
                HashMap<String, Float> vehicleRatePerKm,vehicleIsInsured vehicleIsInsured,vehicleFuelType vehicleFuelType)
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
            System.out.println("VehicleIdentificationNumber" + vehicleIdentificationNumber);
            System.out.println("vehicleDescription"+vehicleDescription);
            System.out.println("vehicleIsSelfDrive"+vehicleIsSelfDrive);
            System.out.println("vehicleManufacturerName"+vehicleManufacturerName);
            System.out.println("vehicleDriverName"+vehicleDriverName);
            System.out.println("vehicleInsuranceProviderName"+vehicleInsuranceProviderName);
            System.out.println("vehicleNoOfSeats"+vehicleNoOfSeats);
            System.out.println("vehicleBaseRate"+vehicleBaseRatePerDay);
            System.out.println("vehicleRatePerKm"+vehicleRatePerKm);
            System.out.println("vehicleIsInsured"+vehicleIsInsured);
            System.out.println("vehicleFuelType"+vehicleFuelType);
            System.out.println("carType"+carType);
            System.out.println("Car_Color"+carColor);
        }

}
