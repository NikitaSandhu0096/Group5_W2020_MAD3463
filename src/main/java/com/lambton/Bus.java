package com.lambton;

import java.util.HashMap;

enum WiFi
    {
        YES,
        NO
    }
    enum Bus_Access_Available
    {
        YES,
        NO
    }
    public class Bus extends Vehicle implements IDisplay
    {
        private String busType;
        private WiFi wifi;
        private Bus_Access_Available access;

        public Bus()
        {
        }
        public Bus(String busType, WiFi wifi, Bus_Access_Available access, int vehicleIdentificationNumber,
                   String vehicleDescription, vehicleIsSelfDrive vehicleIsSelfDrive, String vehicleManufacturerName,
                   String vehicleDriverName, String vehicleInsuranceProviderName,
                   int vehicleNoOfSeats, HashMap<String, Float> vehicleBaseRate,
                   HashMap<String, Float> vehicleRatePerKm, vehicleIsInsured vehicleIsInsured,
                   vehicleFuelType vehicleFuelType)
        {
            super(vehicleIdentificationNumber,vehicleDescription, vehicleIsSelfDrive,vehicleManufacturerName,
                    vehicleDriverName, vehicleInsuranceProviderName, vehicleNoOfSeats, vehicleBaseRate,
                    vehicleRatePerKm,vehicleIsInsured,vehicleFuelType);

            this.busType = busType;
            this.wifi= wifi;
            this.access= access;
        }

        public String getBusType() {
            return busType;
        }

        public void setBusType(String busType) {
            this.busType = busType;
        }

        public WiFi getWifi() {
            return wifi;
        }

        public void setWifi(WiFi wifi) {
            this.wifi = wifi;
        }

        public Bus_Access_Available getAccess() {
            return access;
        }

        public void setAccess(Bus_Access_Available access) {
            this.access = access;
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
            System.out.println("vehicleBaseRate"+vehicleBaseRate);
            System.out.println("vehicleRatePerKm"+vehicleRatePerKm);
            System.out.println("vehicleIsInsured"+vehicleIsInsured);
            System.out.println("vehicleFuelType"+vehicleFuelType);



        }

    }
