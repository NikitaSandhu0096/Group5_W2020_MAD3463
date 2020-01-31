package com.lambton;

import java.time.LocalDate;

public class VehicleRent implements IDisplay {
    LocalDate rentStartDate;
    LocalDate rentEndDate;
    int  rentInNoofDays;
    String[] Vehicle = new String[3];
    float kmDrived;
    float bill;


    @Override
    public void display() {

    }
}
