package com.lambton;

public class MainGroup5 implements IDisplay {
    public static void main(String[] args) { ;
        //display();
        MainGroup5 c = new MainGroup5();

        Owner o1 = c.setOwnerDetails(1, "Caria", "MacNamee", "Female", "1/15/1982", "(463) 6723367", "cmacnamee0@imgur.com", "cmacnamee0", "kn4tCsv", "Eimbee", "(298) 9624526", "auda.org.au", null);

        Owner o2 = c.setOwnerDetails(2, "Merrili", "Ellacott", "Female", "8/8/1991", "(441) 9258734", "mellacot1@parallels.com", "mellacott1", "Rj7c6pjH", "Rooxo", "(772) 7884806", "tmall.com", null);

        Owner o3 = c.setOwnerDetails(3, "Andre", "Elnough", "Male", "8/17/1991", "(319) 4690060", "aelnough2@dailymail.co.uk", "aelnough2", "iCwgJtjOnqsl", "Wikivu", "(551) 2776590", "nature.com", null);

        Owner o4 = c.setOwnerDetails(4, "Kalindi", "Spensly", "Female", "4/9/1993", "(863) 2253855", "kspensly3@oaic.gov.au", "kspensly3", "5FWUMy", "Twitterbeat", "(912) 5937336", "macromedia.com", null);

        Owner o5 = c.setOwnerDetails(5, "Eveline", "Lumox", "Female", "9/22/1995", "(721) 7650492", "elumox4@weather.com", "elumox4", "kn4tCsv", "Leenti", "(654) 4720600", "europa.eu", null);

        Customer c1 = c.setCustomerDetails(1,"Modesty" , "Waplinton", "Female", "4/19/2002", "5862149283", "mwaplinton0@latimes.com", "mwaplinton0", "NnUVAD", "91 Upham Park", "Toronto", null);

        Customer c2 = c.setCustomerDetails(2,"Jerad" , "Ferreres", "Male", "4/5/2002", "7818998000", "jferreres1@ning.com", "jferreres1", "0LrwRtm7stXw", "47 Maywood Hill", "Montreal", null);

        Customer c3 = c.setCustomerDetails(3,"Jennilee" , "Huffey", "Female", "9/17/2000", "8398821265", "jhuffey2@g.co", "jhuffey2", "VW3xv2HF", "31877 Westport Terrace", "Calgary", null);

        Customer c4 = c.setCustomerDetails(4,"Pedro" , "Cartan", "Male", "11/21/1999", "8074607181", "pcartan3@uol.com.br", "pcartan3", "0ajHhk", "03997 Merry Street", "Ottawa", null);

        Customer c5 = c.setCustomerDetails(5,"Gerhard" , "Baile", "Male", "10/29/1999", "4078983814", "harnoll7@constantcontact.com", "ob7IKoJheb", "citry", "080 Forster Parkway", "Edmonton", null);

        Driver d1 = c.setDriverDetails(1,"Pepillo" , "Kitman", "Male", "8/25/1997", "(307) 8389817", "pkitman0@reuters.com", "pkitman0", "FUYGNBaggBD7", "C1273-6361-2413", true, 99988);

        Driver d2 = c.setDriverDetails(2,"Claudio" , "Pedley", "Male", "5/6/1995", "(865) 1017004", "cpedley1@unc.edu", "cpedley1", "xGN14vfkHll", "U3599-0371-8768", false, 33525);

        Driver d3 = c.setDriverDetails(3,"Nerti" , "Maynell", "Female", "3/4/1994", "(347) 3808054", "nmaynell2@yandex.ru", "nmaynell2", "0WDTAu0r5NF", "R1313-8499-5445", true, 52392);

        Driver d4 = c.setDriverDetails(4,"Raynor" , "Stimpson", "Male", "9/3/1992", "(912) 5278838", "rstimpson3@mozilla.com", "rstimpson3", "TALT66zFc", "M6855-0303-0360", true, 66906);

        Driver d5 = c.setDriverDetails(5,"Robb" , "Seton", "Male", "11/3/1990", "(110) 9340421", "rseton4@alibaba.com", "rseton4", "W4j2wkmAjex", "X1059-2321-6215", true, 74000);

        VehicleRent vr1 = c.setVehicleRent("12/6/2019", "12/11/2019", "1N6AD0CU5BC296395", 36);

        VehicleRent vr2 = c.setVehicleRent("12/16/2019", "12/17/2019", "WBA3A5C55CF202202", 100);

        VehicleRent vr3 = c.setVehicleRent("1/6/2020", "1/12/2020", "WBA3B9C51DJ591682", 66);

        VehicleRent vr4 = c.setVehicleRent("1/20/2020", "1/27/2020", "WAUUL98EX8A747315", 45);

        VehicleRent vr5 = c.setVehicleRent("1/29/2020", "1/30/2020", "WAU4FAFL0AA424617", 61);

        Bus b1 = c.setBusDetails("1N6AD0CU5BC296395", "Customer-focused bifurcated groupware", "Ford", false, "Pepillo Kitman", false, null, 48, "Petrol", Double.valueOf(250), Double.valueOf(7), "School bus", true, true);

        Bus b2 = c.setBusDetails("1GD01XEG5FZ726187", "Focused actuating help-desk", "Chevrolet", false, "Claudio Pedley", true, "Aviva", 40, "Diesel", Double.valueOf(250), Double.valueOf(7), "Coach", true, false);

        Bus b3 = c.setBusDetails("3N1CN7AP4DL356756", "Enhanced tertiary Graphical User Interface", "Ford", true, null, true,"Intact Insurance", 30, "Diesel", Double.valueOf(250), Double.valueOf(7), "Double-decker", false, false);

        Bus b4 = c.setBusDetails("1G4HC5EM9BU946298", "Devolved directional firmware", "Nissan", false, "Raynor Stimpson", true, "Aviva", 32, "Petrol", Double.valueOf(250), Double.valueOf(7), "Mini-bus", true, true);

        Bus b5 = c.setBusDetails("3VWML7AJ9CM519278", "Assimilated eco-centric process improvement", "Toyota", false, "Nerti Maynell", true, "Jevco", 35, "Petrol", Double.valueOf(250), Double.valueOf(7), "School bus", false, true);

        Car cr1 = c.setCarDetails("WBA3A5C55CF202202", "Visionary optimal neutral-net", "Scion", false, "Pepillo Kitman", false, null, 6, "Petrol", Double.valueOf(100), Double.valueOf(5), "RSX", "Yellow");

        Car cr2 = c.setCarDetails("5N1CR2MNXEC181212", "Networked background initiative", "Ford", true, null, true, "Aviva", 8, "Diesel", Double.valueOf(100), Double.valueOf(5), "Econoline E150", "Violet");

        Car cr3 = c.setCarDetails("WAUUL98EX8A747315", "Reverse-engineered motivating moderator", "Buick", false, "Robb Seton", true, "Intact Insurance", 6, "Diesel", Double.valueOf(100), Double.valueOf(5), "AeroStar", "Pink");

        Car cr4 = c.setCarDetails("ZHWGU5BZ0CL457896", "Multi-lateral content-based customer loyalty", "Ford", true, null, false, null, 8, "Petrol", Double.valueOf(100), Double.valueOf(5), "Esteem", "Mauv");


    }

    @Override
    public void display() {


    }
}
