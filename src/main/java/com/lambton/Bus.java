package com.lambton;

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
        public Bus()
        {
        }
        public Bus(String busType,WiFi wifi,Bus_Access_Available access)
        {
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

        String busType;
        WiFi wifi;
        Bus_Access_Available access;

        @Override
        public void display()
        {

        }

    }
