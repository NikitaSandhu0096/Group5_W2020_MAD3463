package com.lambton;

import com.lambton.vehicle.Vehicle;

import java.time.LocalDate;

public class VehicleRent implements IDisplay {
    Vehicle v;
    LocalDate rentStartDate;
    LocalDate rentEndDate;
    float  rentInNoOfDays;
    String vehicle;
    float noOfKmDrived;
    float totalBillToPay;

    public VehicleRent(LocalDate rentStartDate, LocalDate rentEndDate, int rentInNoOfDays, String vehicle, float noOfKmDrived, float totalBillToPay) {
        this.rentStartDate = rentStartDate;
        this.rentEndDate = rentEndDate;
        this.rentInNoOfDays = calculateRentInNoOfDays();
        this.vehicle = vehicle;
        this.noOfKmDrived = noOfKmDrived;
        this.totalBillToPay = calculateTotalBillToPay();
    }

    private float calculateRentInNoOfDays() {
        LocalDate s1 = rentStartDate;
        LocalDate s2 = rentEndDate;
        rentInNoOfDays = (s2.getDayOfMonth()-s1.getDayOfMonth())*v.getVehicleBaseRatePerDay();
        return rentInNoOfDays;
    }

    private float calculateTotalBillToPay() {
        return totalBillToPay;
    }

    @Override
    public void display() {

    }
}
