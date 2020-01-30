package com.lambton;

import java.util.HashMap;

public class MotorCycle extends Vehicle implements IDisplay {

    protected float maxtopspeed;
    protected float milage;

    public MotorCycle()
    {
        super();
    }
    public MotorCycle(protected float maxtopspeed,protected float milage,int vehicleIdentificationNumber,
                      String vehicleDescription,vehicleIsSelfDrive vehicleIsSelfDrive,String vehicleManufacturerName,
                      String vehicleDriverName, String vehicleInsuranceProviderName,
                      int vehicleNoOfSeats,HashMap<String, Float> vehicleBaseRate,
                      HashMap<String, Float> vehicleRatePerKm,vehicleIsInsured vehicleIsInsured,
                      vehicleFuelType vehicleFuelType)
    {
        super(int vehicleIdentificationNumber,String vehicleDescription,
            vehicleIsSelfDrive vehicleIsSelfDrive,String vehicleManufacturerName,
            String vehicleDriverName, String vehicleInsuranceProviderName,
            int vehicleNoOfSeats, HashMap<String, Float> vehicleBaseRate,
            HashMap<String, Float> vehicleRatePerKm,
            vehicleIsInsured vehicleIsInsured,vehicleFuelType vehicleFuelType);

    }


    public float getMaxtopspeed() {
        return maxtopspeed;
    }

    public void setMaxtopspeed(float maxtopspeed) {
        this.maxtopspeed = maxtopspeed;
    }

    public float getMilage() {
        return milage;
    }

    public void setMilage(float milage) {
        this.milage = milage;
    }

    public MotorCycle(float maxtopspeed, float milage)
    {
        this.maxtopspeed = maxtopspeed;
        this.milage= milage;
    }


    @Override
    public void display() {

    }
}
