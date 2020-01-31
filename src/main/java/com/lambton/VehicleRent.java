package com.lambton;

import java.time.LocalDate;

public class VehicleRent implements IDisplay {
    LocalDate rentStartDate;
    LocalDate rentEndDate;
    int  rentInNoOfDays;
    String vehicle;
    float noOfKmDrived;
    float totalBillToPay;

    public VehicleRent(LocalDate rentStartDate, LocalDate rentEndDate, int rentInNoOfDays, String vehicle, float noOfKmDrived, float totalBillToPay) {
        this.rentStartDate = rentStartDate;
        this.rentEndDate = rentEndDate;
        this.rentInNoOfDays = rentInNoOfDays;
        this.vehicle = vehicle;
        this.noOfKmDrived = noOfKmDrived;
        this.totalBillToPay = totalBillToPay;
    }

    @Override
    public void display() {

    }
}
