package com.lambton.vehicle;

import com.lambton.IDisplay;

import java.util.ArrayList;
import java.util.HashMap;

public class Bus extends Vehicle {
    private String busType;
    private boolean iswifiAvailable;
    private boolean isAccessibiltyServiceAvailable;

    public Bus() {
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public boolean isIswifiAvailable() {
        return iswifiAvailable;
    }

    public void setIswifiAvailable(boolean iswifiAvailable) {
        this.iswifiAvailable = iswifiAvailable;
    }

    public boolean isAccessibiltyServiceAvailable() {
        return isAccessibiltyServiceAvailable;
    }

    public void setAccessibiltyServiceAvailable(boolean isAccessibiltyServiceAvailable) {
        this.isAccessibiltyServiceAvailable = isAccessibiltyServiceAvailable;
    }


    @Override
    public void display() {
        System.out.println("Bus [busType=" + busType + ", iswifiAvailable=" + iswifiAvailable + ", isAccessibiltyServiceAvailable="
                + isAccessibiltyServiceAvailable + ", identificationNumber=" + getIdentificationNumber()
                + ", description=" + getDescription() + ", selfDrive=" + isSelfDrive()
                + ", manufacturerName=" + getManufacturerName() + ", isInsured=" + isInsured()
                + ", vehicleNoOfSeats=" + getVehicleNoOfSeats() + ", insuranceProviderName="
                + getInsuranceProviderName() + ", seat=" + getSeat() + ", fuelType=" + getFuelType()
                + ", ratePerDay=" + getRatePerDay() + ", ratePerKm=" + getRatePerKm() +  "]");

    }

}
