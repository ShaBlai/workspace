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

import java.time.*;
import java.time.format.*;

import static java.time.temporal.TemporalAdjusters.*;

class DerivedDateTimeTest {

    /**
     * main() calls each of the test methods in turn (currently commented out).
     * To run one test method at a time, uncomment the call to the one you want to execute.
     */
    public static void main(String[] args) {
        testPresidentsFirst100Days();
        testPopularBirthdays();
        testEarlyRetirement();
        testLaborDay();
        // testElectionDay();
        // testAnniversary();
    }

    public static void testPresidentsFirst100Days() {
        LocalDate inauguration = LocalDate.of(2017, 1, 20);
        LocalDate PresidentDeadline = inauguration.plusDays(100);
        System.out.println("The ending of the first 100 days in office for the President is " + PresidentDeadline);
    }


    public static void testPopularBirthdays() {
        // TODO: what is the average birthday of someone conceived on Valentine's Day?
        LocalDate Valentines = LocalDate.of(2021, 2, 14);
        LocalDate Birthday = Valentines.plusWeeks(38);
        System.out.println("The average birthday of someone conceived on Valentines is " + Birthday);

        // TODO: what is the average birthday of someone conceived on New Year's Eve (after midnight)?

        LocalDate NewYears = LocalDate.of(2021, 1, 1);
        LocalDate Birthday2 = NewYears.plusMonths(9);
        System.out.println("The average birthday of someone conceived on New Year's is " + Birthday2);

    }
    /**
     * TASK: you've saved diligently your whole life and plan to retire as soon as
     * you can take distributions from your 401(k) penalty-free, which is when you turn 59 1/2.
     * When will / did you retire?
     * <p>
     * RESULT:
     */
    public static void testEarlyRetirement() {
       LocalDate Birthday1 = LocalDate.of(1989,10,15);
       LocalDate Retirement = Birthday1.plusYears(59).plusMonths(6);
       System.out.println("My retirement age is " + Birthday1);
    }

    /**
     * TASK: when was Labor Day during the year you were born?
     * Note: start with a LocalDate equal to your birthday.
     * Note: Labor Day is the first Monday in Sept.
     * <p>
     * RESULT:
     */

    public static void testLaborDay() {
        LocalDate Birthday = LocalDate.of(1989,10,15);
        LocalDate LaborDay = Birthday.withMonth(9).withDayOfMonth(1); //TODO not sure syntax how to find the exact day of week?
        System.out.println("Labor Day is " + LaborDay);
    }

    /**
     * TASK: Election Day in the United States is defined as the Tuesday immediately after the 1st Monday in November.
     * When is Election Day 2024?
     * <p>
     * RESULT:
     */
    public static void testElectionDay() {
        // TODO not sure syntax for exact date
    }

    /**
     * TASK: Akesh and Samanta were married on 6/6/1969.
     * They are planning their 50th wedding anniversary, and would like to throw a big party.
     * If their anniversary does not fall on a Saturday, they'd like to have their party the following Saturday.
     * What is the date of the party?
     * <p>
     * RESULT:
     */
    public static void testAnniversary() {
        // TODO
    }
}