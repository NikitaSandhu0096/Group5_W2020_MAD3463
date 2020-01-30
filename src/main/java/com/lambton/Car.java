package com.lambton;

import java.util.ArrayList;

public class Car extends Vehicle implements IDisplay {
    String carType ;
    ArrayList<String>carColor = new ArrayList<> ();

    @Override
    public void display() {
    }
}
