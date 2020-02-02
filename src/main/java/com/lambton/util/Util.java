package com.lambton.util;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Util {
    public LocalDate getDateFromString(String date) throws ParseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(date, formatter);
    }
    public int calculateAge(LocalDate birthDate) {

        LocalDate now = LocalDate.now();
        Period diff = Period.between(birthDate, now);
        return diff.getYears();
    }

}
