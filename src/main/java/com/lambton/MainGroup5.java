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


    }

    @Override
    public void display() {


    }
}
