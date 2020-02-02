package com.lambton.vehicle;

import com.lambton.IDisplay;

import java.util.HashMap;

public class MotorCycle extends Vehicle {

    private int maxTopSpeed;
    private int milage;

    public MotorCycle() {
        super();
    }

    public int getMaxTopSpeed() {
        return maxTopSpeed;
    }

    public void setMaxTopSpeed(int maxTopSpeed) {
        this.maxTopSpeed = maxTopSpeed;
    }

    public int getMilage() {
        return milage;
    }

    public void setMilage(int milage) {
        this.milage = milage;
    }

    @Override
    public void display() {
        System.out.println("********************Displaying MotorCycle Details********************");

        System.out.println("MotorCycle [maxTopSpeed=" + maxTopSpeed + ", milage=" + milage + ", identificationNumber="
                + getIdentificationNumber() + ", description=" + getDescription() + ", selfDrive=" + isSelfDrive()
                + ", manufacturerName=" + getManufacturerName() + ", isInsured=" + isInsured() + ", vehicleNoOfSeats="
                + getVehicleNoOfSeats() + ", insuranceProviderName=" + getInsuranceProviderName() + ", seat="
                + getSeat() + ", fuelType=" + getFuelType() + ", ratePerDay=" + getRatePerDay() + ", ratePerKm="
                + getRatePerKm() + "]");
    }
}
