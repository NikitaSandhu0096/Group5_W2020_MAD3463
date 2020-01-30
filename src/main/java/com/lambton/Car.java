package com.lambton;

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
                String vehicleManufacturerName,String vehicleDriverName, String vehicleInsuranceProviderName, int vehicleNoOfSeats, HashMap<String, Float> vehicleBaseRate,
                HashMap<String, Float> vehicleRatePerKm,vehicleIsInsured vehicleIsInsured,vehicleFuelType vehicleFuelType)
    {
        super(vehicleIdentificationNumber,vehicleDescription,vehicleIsSelfDrive,
                vehicleManufacturerName,vehicleDriverName,vehicleInsuranceProviderName,
                vehicleNoOfSeats,vehicleBaseRate,vehicleRatePerKm,vehicleIsInsured,vehicleFuelType);
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
        }

}
