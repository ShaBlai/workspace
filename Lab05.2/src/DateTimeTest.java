/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

/*
 * The Java 8 Date/Time API consists of package java.time and its subpackages.
 * We will cover packages and imports in Session 7.
 * For the purposes of this lab, we give you a few wildcarded imports,
 * so you can use the classes in these packages without having to worry about importing them.
 */
import java.sql.SQLOutput;
import java.time.*;
import java.time.format.*;

class DateTimeTest {

    public static void main(String[] args) {
           testNow();
           testCreate();
           testParse();
           testFormat();
    }

    public static void testNow() {
        //current time method
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        LocalTime timerNow = LocalTime.now();
        System.out.println(timerNow);

        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println(currentTime);
    }


    public static void testCreate() {
       //Birthday time method
        LocalDate myBirthday = LocalDate.of(1989,10, 15);
        String formatBirthday = myBirthday.format(DateTimeFormatter.ofPattern("EEE, YYYY-MM-dd"));
        System.out.println("My birthday is this date: " + formatBirthday);


       //moonlanding time method
        LocalDate moonLanding = LocalDate.of(1969,7,20);
        LocalTime moonLandingTime = LocalTime.of(15,18); //TODO research how to have this in one line with moonLanding?
        String formatLanding = moonLanding.format(DateTimeFormatter.ofPattern("EEE, yyyy-MM-dd"));
        System.out.println("The moon landing was at this date: " + formatLanding + " " + moonLandingTime);
    }

    public static void testParse() {
        //parsed birthday method
        LocalDate parseBirthday = LocalDate.parse("1989-10-15");
        System.out.println("This is my parsed birthday " + parseBirthday);
    }

    public static void testFormat() {
        //hastings declaration local date
        LocalDate hastings = LocalDate.of(1066, 10, 14);

        //hastings 1
        String formatHastings1 = hastings.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("This is the first hastings " + formatHastings1);

        //hastings 2
        String formatHastings2 = hastings.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println("This is the second hastings " + formatHastings2);

        //hastings 3
        String formatHastings3 = hastings.format(DateTimeFormatter.ofPattern("MMMM d, yyyy"));
        System.out.println("This is the third hastings " + formatHastings3);

    }
}