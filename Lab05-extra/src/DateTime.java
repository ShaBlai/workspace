
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static java.time.format.DateTimeFormatter.ofPattern;


public class DateTime {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("now = "+today);
        LocalDate theDayAfterTomorrow = today.plusDays(2);
        System.out.println("theDayAfterTomorrow = " + theDayAfterTomorrow);
        System.out.println(" ");

        LocalDate.of(2022,10,18);

        LocalTime now = LocalTime.now();
        System.out.println(LocalTime.now() +"/n");



        DateTimeFormatter dateTimeFormatter = ofPattern("MMM-dd-yyyy");

            LocalDate localDate = LocalDate.parse(
                    "Mar-20-1967",
                    dateTimeFormatter);
        System.out.println(localDate);


        LocalDate moonLanding = LocalDate.of(1901,12,5); //moonnnn
        String display = moonLanding.format(ofPattern("EEE, d MMM yyy"));
        System.out.println(display);






    }




}
