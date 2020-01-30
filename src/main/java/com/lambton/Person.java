package com.lambton;

enum Gender {
    MALE,
    FEMALE,
    OTHER
}

public abstract class Person implements IDisplay {
    int Id;
    String firstName;
    String lastName;
    Gender gender;
   // LocalDate birthDate;
    int age;
    int mobileNumber;
    String emailId;
    String userName;
    String password;
}
