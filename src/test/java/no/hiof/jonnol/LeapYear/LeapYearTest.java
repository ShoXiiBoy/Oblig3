package no.hiof.jonnol.LeapYear;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;


public class LeapYearTest {


    //The messages are only shown if the tests fails
    @Test
    public void yearShouldBeLeapYear() {
        assertTrue(LeapYear.isLeapYear(2000), "Year 2000 should be a leap year");
    }

    @Test
    public void yearShouldNotBeLeapYear() {
        assertFalse(LeapYear.isLeapYear(2100), "Year 2100 should not be a leap year");
        assertFalse(LeapYear.isLeapYear(2000), "Year 900 should not be a leap year");

    }

    @Test
    public void yearShouldBeDivisibleBy4NotDivisibleBy100() {
        assertTrue(LeapYear.isLeapYear(2024), "Year 2024 should be divisible by 4 but not by 100)");
        assertTrue(LeapYear.isLeapYear(1996), "Year 1996 should be divisible by 4 but not by 100)");
    }

    @Test
    public void yearShouldBeDivisibleBy400() {
        assertTrue(LeapYear.isLeapYear(1600), "Year 1600 should be divisible by 400");
        assertTrue(LeapYear.isLeapYear(2000), "Year 2000 should be divisible by 400)");
    }

    @Test
    public void yearShouldNotBeDivisibleBy4() {
        assertFalse(LeapYear.isLeapYear(2021), "Year 2021 should not be divisible by 4)");
        assertFalse(LeapYear.isLeapYear(1999), "Year 1999 should not be divisible by 4)");
    }

    @Test
    public void yearShouldBeDivisibleBy100NotDivisibleBy400() {
        assertFalse(LeapYear.isLeapYear(1700), "Year 1700 should be divisible by 100 but not by 400)");
        assertFalse(LeapYear.isLeapYear(1800), "Year 1800 should be divisible by 100 but not by 400)");
        assertFalse(LeapYear.isLeapYear(1900), "Year 1900 should be divisible by 100 but not by 400)");
        assertFalse(LeapYear.isLeapYear(2100), "Year 2100 should be divisible by 100 but not by 400)");
    }

}
