package com.lambton;

import com.lambton.constants.Constant;
import com.lambton.person.Customer;
import com.lambton.person.Driver;
import com.lambton.person.Owner;
import com.lambton.util.TrippleDes;
import com.lambton.util.Util;
import com.lambton.vehicle.Bus;
import com.lambton.vehicle.Car;
import com.lambton.vehicle.MotorCycle;
import com.lambton.vehicle.Vehicle;

import java.io.File;
import java.io.PrintStream;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class MainGroup5 {

    List<Vehicle> vehicleList = new ArrayList<Vehicle>();
    List<Owner> ownerList = new ArrayList<Owner>();
    List<Customer> customerList = new ArrayList<Customer>();
    TrippleDes td = TrippleDes.getInstance();
    Util util = new Util();

    public static void main(String[] args) {
        try {
            PrintStream o = new PrintStream(new File(System.getProperty("user.dir") + "/output_vehicle_renting_system.txt"));
            PrintStream console = System.out;
            System.setOut(o);
           // System.setOut(console);

            MainGroup5 mg = new MainGroup5();
            //mg.decrypt("MtFUuy14O7I=");
            mg.createOwner();
            mg.displayOwnerDetails();
            mg.createCustomer();
            mg.displayCustomerDetails();
        } catch (ParseException p) {
            System.out.println("Enter the date in dd/mm/yyyy format" + p.getMessage());
        } catch (Exception e) {
            System.out.println("Exception Occured" + e.getMessage());
        }
    }

    public void createOwner() throws ParseException, Exception {

        Owner owner1 = setOwnerDetails(1, "Caria", "MacNamee", "male", "21/10/1994", "(463) 6723367",
                "cmacnamee0@imgur.com", "cmacnamee0", "kn4tCsv", "Eimbee", "(298) 9624526", "auda.org.au", null);

        Owner owner2 = setOwnerDetails(2, "Merrili", "Ellacott", "Female", "10/10/1992", "(441) 9258734",
                "kn4mellacott1@parallels.com", "mellacott1", "Rj7c6pjH", "Rooxo", "(772) 7884806", "tmall.com", null);

        Owner owner3 = setOwnerDetails(3, "Andre", "Elnough", "Male", "23/07/1990", "(319) 4690060",
                "aelnough2@dailymail.co.uk", "aelnough2", "iCwgJtjOnqsl", "Wikivu", "(551) 2776590", "nature.com",
                null);

        Owner owner4 = setOwnerDetails(4, "Kalindi", "Spensly", "Female", "15/06/1970", "(863) 2253855",
                "kspensly3@oaic.gov.au", "kspensly3", "5FWUMy", "Twitterbeat", "(912) 5937336", "macromedia.com", null);

        Owner owner5 = setOwnerDetails(5, "Merrili", "Ellacott", "Female", "27/01/1975", "(441) 9258734",
                "mellacot1@parallels.com", "mellacott1", "Rj7c6pjH", "Rooxo", "(772) 7884806", "tmall.com", null);

        Driver d1 = setDriverDetails(1, "Pepillo", "Kitman", "Male", "10/11/1995", 0, "(307) 8389817",
                "pkitman0@reuters.com", "pkitman0", "FUYGNBaggBD7", "C1273-6361-2413", true, 99988);
        Driver d2 = setDriverDetails(2, "Claudio", "Pedley", "Male", "09/10/1986", 0, "(865) 1017004",
                "cpedley1@unc.edu", "cpedley1", "xGN14vfkHll", "U3599-0371-8768", false, 33525);
        Driver d3 = setDriverDetails(3, "Nerti", "Maynell", "Female", "15/09/1980", 0, "(347) 3808054",
                "nmaynell2@yandex.com", "nmaynell2", "0WDTAu0r5NF", "R1313-8499-5445", true, 52392);
        Driver d4 = setDriverDetails(4, "Raynor", "Stimpson", "Male", "20/08/1979", 0, "(912) 5278838",
                "rstimpson3@mozilla.com", "rstimpsone13", "TALT6iyFc", "M6855-0303-0360", true, 66906);
        Driver d5 = setDriverDetails(5, "Robb", "Seton", "Male", "22/07/1975", 0, "(110) 9340421",
                "rseton4@alibaba.com", "rsetone44", "W4j672wkmAjex", "X1059-2321-6215", true, 74000);

        List<Vehicle> owner1vehicleList = new ArrayList<Vehicle>();
        owner1.setVehicles(owner1vehicleList);
        List<Vehicle> owner2vehicleList = new ArrayList<Vehicle>();
        owner2.setVehicles(owner2vehicleList);
        List<Vehicle> owner3vehicleList = new ArrayList<Vehicle>();
        owner3.setVehicles(owner3vehicleList);
        List<Vehicle> owner4vehicleList = new ArrayList<Vehicle>();
        owner4.setVehicles(owner4vehicleList);
        List<Vehicle> owner5vehicleList = new ArrayList<Vehicle>();
        owner5.setVehicles(owner5vehicleList);

        Bus b1 = setBusDetails("1N6AD0CU55BC296395", "Customer-focused bifurcated group ware", false, "Ford", false, 4,
                "Pepillo Kitman", 9, null, 300, 10D, "MiniBus", false, true);
        if (!b1.isSelfDrive())
            b1.setDriver(d1);
        Bus b2 = setBusDetails("1G4HC5EMR9BU946298", "Focused actuating help-desk", false, "Chevrolet", false, 6,
                "Claudio Pedley", 16, "Diesel", 150, 5D, "School Bus", false, false);
        if (!b2.isSelfDrive())
            b2.setDriver(d2);
        Bus b3 = setBusDetails("3VWML7AJK9CM519278", "Customer-focused bifurcated", false, "Ford", false, 4,
                "Pepillo Kitman", 49, "Petrol", 350, 15D, "Volvo", true, true);
        if (!b3.isSelfDrive())
            b3.setDriver(d3);
        Bus b4 = setBusDetails("1GD01XEG5FZ726187", "Focused actuating help-desk", false, "Benz", false, 6,
                "Claudio Pedley", 26, "Diesel", 210, 11D, "double decker", true, true);
        if (!b4.isSelfDrive())
            b4.setDriver(d4);

        Bus b5 = setBusDetails("1GD01XEG5FZ766187", "Focused actuating help-desk", false, "Benz", false, 6,
                "Nerti Young", 26, "Diesel", 210, 11D, "double decker", true, true);
        if (!b5.isSelfDrive())
            b5.setDriver(d5);
        
        Car cr1 = setCarDetails("WBA3A5C5CF282202", "Visionary optimal neutral-net", false, "Scion", true, 4,
                "Pepillo Kitman", 4, "Diesel", 200, 12D, "Sedan", "Red");
        if (!cr1.isSelfDrive())
            cr1.setDriver(d5);

        Car cr2 = setCarDetails("5N1CR2MC181212", "Networked background initiative", true, "Ford", false, 4, "Aviva",
                4, "Diesel", 120, 5D, "AeroStar", "White");
        if (!cr2.isSelfDrive())
            cr2.setDriver(d2);
        Car cr3 = setCarDetails("WAUUL98EX47315", "Reverse-engineered motivating moderator", true, "Buick", false, 4,
                "Intact Insurance", 5, "Petrol", 150, 8d, "Econoline E150", "Violet");
        if (!cr3.isSelfDrive())
            cr3.setDriver(d3);
        Car cr4 = setCarDetails("ZHWEU5BZ0CL457896", "Visionary optimal neutral-net", true, "Scion", false, 4,
                "Pepillo Kitmankn", 4, "Electric", 210, 9D, "Sedan", "Red");
        if (!cr4.isSelfDrive())
            cr4.setDriver(d4);
        Car cr5 = setCarDetails("WAU4FAFL0AA424617", "Visionary optimal neutral-net", true, "Scion", false, 4,
                "Pepillo Kitman", 4, "Diesel", 70, 8D, "Suv", "Black");
        if (!cr5.isSelfDrive())
            cr5.setDriver(d5);
        MotorCycle mc1 = setMotorCycleDetails("WBA3B9C51DJ591682", "Right-sized 24/7 projection", true,
                "Harley Davidson", false, 2, "Pepillo Kitman", 2, "petrol", 10, 5, 60, 30);
        MotorCycle mc2 = setMotorCycleDetails("WBAVB13506K975623", "Multi-lateral needs-based superstructure", true,
                "Harley Davidson", false, 2, "Pepillo Kitman", 2, "petrol", 9, 5, 60, 32);
        MotorCycle mc3 = setMotorCycleDetails("JH4DB76611SNM929", "Secured local encryption", true, "Harley Davidson",
                true, 2, "Jevco Kitman", 2, "petrol", 20, 5, 60, 39);
        MotorCycle mc4 = setMotorCycleDetails("WAUKH74F17NO62385", "Seamlessnational benchmark", true,
                "Harley Davidson", true, 2, "Intact Insurance", 2, "petrol", 10, 5, 60, 30);
        MotorCycle mc5 = setMotorCycleDetails("JM1CW2CL1F0860981", "Secured local encryption", true, "Harley Davidson",
                false, 2, "Pepillo Kitman", 2, "petrol", 30, 5, 60, 38);

        owner1vehicleList.add(b1);
        owner1vehicleList.add(cr1);
        owner1vehicleList.add(mc1);

        owner2vehicleList.add(b2);
        owner2vehicleList.add(cr2);
        owner2vehicleList.add(mc2);

        owner3vehicleList.add(b3);
        owner3vehicleList.add(cr3);
        owner3vehicleList.add(mc3);

        owner4vehicleList.add(b4);
        owner4vehicleList.add(cr4);
        owner4vehicleList.add(mc4);

        owner5vehicleList.add(cr5);
        owner4vehicleList.add(mc5);

        ownerList.add(owner1);
        ownerList.add(owner2);
        ownerList.add(owner3);
        ownerList.add(owner4);
        ownerList.add(owner5);

        vehicleList.add(b1);
        vehicleList.add(b2);
        vehicleList.add(b3);
        vehicleList.add(b4);
        vehicleList.add(cr1);
        vehicleList.add(cr2);
        vehicleList.add(cr3);
        vehicleList.add(cr4);
        vehicleList.add(cr5);
        vehicleList.add(mc1);
        vehicleList.add(mc2);
        vehicleList.add(mc3);
        vehicleList.add(mc4);
        vehicleList.add(mc5);

    }

    public void createCustomer() throws Exception {

        Customer c1 = setCustomerDetails(1,"Nikita", "Sandhu", "Female", "13/10/1994",0,"3647912580","nsandhu123@gmail.com",
                "NSandhu96","sandhu81123","159, Confederation drive", "Mississauga",null);

        Customer c2 = setCustomerDetails(2, "Jerad", "Ferreres", "Male", "10/11/1995", 0, "7946132580",
                "jferreres1", "0LrwRtm7stXw", "258g11hr", "47 Maywood Hill Montreal", "Ontario", null);

        Customer c3 = setCustomerDetails(3, "Jennilye", "Huffey", "Female", "09/08/1989", 0, "8398821265",
                "jenhuffey2@g.co", "jhuffey2", "VW3xv2HF", "31877 Westport Terrace ON", "Calgary", null);

        Customer c4 = setCustomerDetails(4, "Pedro", "Cartan", "Male", "08/12/1990", 0, "8074607181",
                "pcartan3@uol.com.br", "pcartan3", "0ajHhk", "03997 Merry Street", "Ottawa", null);

        Customer c5 = setCustomerDetails(5, "Gerhard", "Baile", "Male", "07/05/1979", 0, "4078983814",
                "harnoll7@constantcontact.org", "gbaile2", "citry452", "3080 Forster Parkway", "Edmonton", null);

        List<VehicleRent> cs1rnt = new ArrayList<VehicleRent>();
        List<VehicleRent> cs2rnt = new ArrayList<VehicleRent>();
        List<VehicleRent> cs3rnt = new ArrayList<VehicleRent>();
        List<VehicleRent> cs4rnt = new ArrayList<VehicleRent>();

        VehicleRent vr1 = setVehicleRent("07/05/2019", "08/05/2019", "3VWML7AJ9CM519278", 300);

        VehicleRent vr2 = setVehicleRent("08/10/2019", "28/10/2019", "1GD01XEG5FZ726187", 100);

        cs1rnt.add(vr1);
        cs1rnt.add(vr2);

        VehicleRent vr3 = setVehicleRent("10/11/2019", "08/12/2019", "WAUUL98EX8A747315", 66);
        cs2rnt.add(vr3);

        VehicleRent vr4 = setVehicleRent("15/10/2019", "08/12/2019", "WAU4FAFL0AA424617", 45);
        cs3rnt.add(vr4);

        VehicleRent vr5 = setVehicleRent("15/08/2019", "12/09/2019", "JM1CW2CL1F0860981", 61);
        cs4rnt.add(vr5);
        c2.setVehicleRent(cs1rnt);
        c3.setVehicleRent(cs2rnt);
        c4.setVehicleRent(cs3rnt);
        c5.setVehicleRent(cs4rnt);
        customerList.add(c2);
        customerList.add(c3);
        customerList.add(c4);
        customerList.add(c5);

    }

    private Owner setOwnerDetails(int id, String firstName, String lastName, String gender, String birthDate,
                                  String mobileNumber, String emailId, String userName, String password, String companyTitle,
                                  String businessLandLineNumber, String website, List<Vehicle> vehicles) throws Exception {
        Owner owner = new Owner();
        LocalDate bDate = util.getDateFromString(birthDate);
        owner.setId(id);
        owner.setFirstName(firstName);
        owner.setLastName(lastName);
        owner.setGender(gender);
        owner.setBirthDate(bDate);
        owner.setAge(util.calculateAge(bDate));
        owner.setMobileNumber(mobileNumber);
        owner.setEmailId(emailId);
        owner.setUserName(userName);
        String encrypted = td.encrypt(password, Constant.KEY);
        owner.setPassword(encrypted);
        owner.setCompanyTitle(companyTitle);
        owner.setBusinessLandLineNumber(businessLandLineNumber);
        owner.setWebsite(website);
        return owner;

    }

    public Driver setDriverDetails(int id, String firstName, String lastName, String gender, String birthDate, int age,
                                   String mobileNumber, String emailId, String userName, String password, String drivingLicenceNumber,
                                   boolean isDrivingHistoryCleared, int salary) throws Exception {
        Driver driver = new Driver();
        LocalDate bDate = util.getDateFromString(birthDate);
        driver.setId(id);
        driver.setFirstName(firstName);
        driver.setLastName(lastName);
        driver.setGender(gender);
        driver.setBirthDate(bDate);
        driver.setAge(util.calculateAge(bDate));
        driver.setMobileNumber(mobileNumber);
        driver.setEmailId(emailId);
        String encrypted = td.encrypt(password, Constant.KEY);
        driver.setPassword(encrypted);
        //driver.setPassword(password);
        driver.setDrivingLicenceNumber(drivingLicenceNumber);
        driver.setDrivingHistoryCleared(isDrivingHistoryCleared);
        driver.setSalary(salary);
        return driver;

    }

    public Customer setCustomerDetails(int id, String firstName, String lastName, String gender, String birthDate,
                                       int age, String mobileNumber, String emailId, String userName, String password, String address, String city,
                                       List<VehicleRent> vehicleRent) throws Exception {

        Customer customer = new Customer();
        LocalDate bDate = util.getDateFromString(birthDate);
        customer.setId(id);
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setGender(gender);
        customer.setBirthDate(bDate);
        customer.setAge(util.calculateAge(bDate));
        customer.setMobileNumber(mobileNumber);
        customer.setEmailId(emailId);
        String encrypted = td.encrypt(password, Constant.KEY);
        customer.setPassword(encrypted);
        //customer.setPassword(password);
        customer.setAddress(address);
        customer.setCity(city);
        return customer;

    }

    public Car setCarDetails(String identificationNumber, String description, boolean isSelfDrive,
                             String manufacturerName, boolean isInsured, int vehicleNoOfSeats, String insuranceProviderName, int seat,
                             String fuelType, double ratePerDay, double ratePerKm, String carType, String carColor) {
        Car car = new Car();
        car.setIdentificationNumber(identificationNumber);
        car.setDescription(description);
        car.setSelfDrive(isSelfDrive);
        car.setManufacturerName(manufacturerName);
        car.setInsured(isInsured);
        car.setVehicleNoOfSeats(vehicleNoOfSeats);
        car.setInsuranceProviderName(insuranceProviderName);
        car.setSeat(seat);
        car.setFuelType(fuelType);
        car.setRatePerDay(ratePerDay);
        car.setRatePerKm(ratePerKm);
        car.setCarType(carType);
        car.setCarColor(carColor);
        return car;
    }

    public MotorCycle setMotorCycleDetails(String identificationNumber, String description, boolean isSelfDrive,
                                           String manufacturerName, boolean isInsured, int vehicleNoOfSeats, String insuranceProviderName, int seat,
                                           String fuelType, double ratePerDay, double ratePerKm, int maxTopSpeed, int milage) {
        MotorCycle mc = new MotorCycle();
        mc.setIdentificationNumber(identificationNumber);
        mc.setDescription(description);
        mc.setSelfDrive(isSelfDrive);
        mc.setManufacturerName(manufacturerName);
        mc.setInsured(isInsured);
        mc.setVehicleNoOfSeats(vehicleNoOfSeats);
        mc.setInsuranceProviderName(insuranceProviderName);
        mc.setSeat(seat);
        mc.setFuelType(fuelType);
        mc.setRatePerDay(ratePerDay);
        mc.setRatePerKm(ratePerKm);
        mc.setMaxTopSpeed(maxTopSpeed);
        mc.setMilage(milage);
        return mc;
    }

    public Bus setBusDetails(String identificationNumber, String description, boolean isSelfDrive,
                             String manufacturerName, boolean isInsured, int vehicleNoOfSeats, String insuranceProviderName, int seat,
                             String fuelType, double ratePerDay, double ratePerKm, String busType, boolean iswifiAvailable,
                             boolean isAccessibiltyServiceAvailable) {
        Bus bus = new Bus();
        bus.setIdentificationNumber(identificationNumber);
        bus.setDescription(description);
        bus.setSelfDrive(isSelfDrive);
        bus.setManufacturerName(manufacturerName);
        bus.setInsured(isInsured);
        bus.setVehicleNoOfSeats(vehicleNoOfSeats);
        bus.setInsuranceProviderName(insuranceProviderName);
        bus.setSeat(seat);
        bus.setFuelType(fuelType);
        bus.setRatePerDay(ratePerDay);
        bus.setRatePerKm(ratePerKm);
        bus.setBusType(busType);
        bus.setIswifiAvailable(iswifiAvailable);
        bus.setAccessibiltyServiceAvailable(isAccessibiltyServiceAvailable);
        return bus;
    }

    public VehicleRent setVehicleRent(String startDate, String endDate, String vehicleId, int kilometers)
            throws ParseException {
        VehicleRent rent = new VehicleRent();
        LocalDate sDate = util.getDateFromString(startDate);
        LocalDate eDate = util.getDateFromString(endDate);
        Vehicle vehicle = getVehicleFromId(vehicleId);
        float days = findDaysBetweenDates(sDate, eDate);
        rent.setRentStartDate(sDate);
        rent.setRentEndDate(eDate);
        rent.setRentInNoOfDays(days);
        rent.setNoOfKmDrived(kilometers);
        rent.setVehicle(vehicle);
        rent.setTotalBillToPay(findTotalBill(vehicle.getRatePerDay(), kilometers, vehicle.getRatePerKm(), days));
        return rent;
    }

    public long findDaysBetweenDates(LocalDate startDate, LocalDate endDate) {
        return ChronoUnit.DAYS.between(startDate, endDate);
    }

    public Double findTotalBill(double baseRate, int Kilometers, double ratePerKilometer, float noOfDays) {
        Double basPrice = (double) (baseRate * noOfDays);
        Double total = (double) (ratePerKilometer * Kilometers);
        return basPrice + total;

    }

    public Vehicle getVehicleFromId(String vehicleId) {
        for (Vehicle vehicle : vehicleList) {
            if (vehicleId.equals(vehicle.getIdentificationNumber())) {
                return vehicle;
            }
        }
        return null;
    }

    public void displayOwnerDetails() {
        if (ownerList.size() > 0) {
            System.out.println("_______________________________________________");
            System.out.println("-------------------OWNER-----------------------");
            System.out.println("_______________________________________________");

            for (Owner owner : ownerList) {

                owner.display();
                if (owner.getVehicles() != null || owner.getVehicles().size() > 0) {
                    for (Vehicle vehicle : owner.getVehicles()) {

                        vehicle.display();
                        if (vehicle.getDriver() != null) {
                            vehicle.getDriver().display();
                        }

                    }
                }
            }
        }

    }

    public void displayCustomerDetails() {
        if (customerList.size() > 0) {
            System.out.println("_______________________________________________");
            System.out.println("-------------------CUSTOMER-----------------------");
            System.out.println("_______________________________________________");

            for (Customer customer : customerList) {

                customer.display();
                if (customer.getVehicleRent() != null || customer.getVehicleRent().size() > 0) {
                    for (VehicleRent rent : customer.getVehicleRent()) {

                        rent.display();
                        if (rent.getVehicle() != null) {

                            rent.getVehicle().display();

                            if (rent.getVehicle().getDriver() != null) {
                                rent.getVehicle().getDriver().display();

                            }
                        }

                    }
                }
            }

        }
    }

    public void decrypt(String encryptedString) throws Exception {
        System.out.println(td.decrypt(encryptedString, Constant.KEY));

    }
}
