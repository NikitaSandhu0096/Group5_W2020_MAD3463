package com.lambton;

import java.util.ArrayList;

public  class Car extends Vehicle implements IDisplay
{

    public Car()
    {}
    public  Car(String carType,ArrayList<String> carColor)
    {
        this.carType = carType;
        this.carColor = carColor;
    }

    public String carType ;
    public ArrayList<String> carColor = new ArrayList<> ();

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
