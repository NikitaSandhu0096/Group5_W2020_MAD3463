package com.lambton;

enum Gender {
    MALE,
    FEMALE,
    OTHER
}

public abstract class Person implements IDisplay {
    protected int Id;
    protected String firstName;
    protected String lastName;
    protected Gender gender;
   //protected LocalDate birthDate;
    protected int age;
    protected int mobileNumber;
    protected String emailId;
    protected String userName;
    protected String password;

    public abstract void display();
}
