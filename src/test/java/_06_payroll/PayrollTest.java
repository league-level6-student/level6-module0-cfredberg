package _06_payroll;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PayrollTest {

    Payroll payroll = new Payroll();

    @Test
    void itShouldCalculatePaycheck() {
        //given
        double wage = 5.99;
        int hours = 13;
        double expected = 5.99*13;
        //when
        double actual = payroll.calculatePaycheck(wage, hours);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void itShouldCalculateMileageReimbursement() {
        //given
        double centsPerMile = 0.575;
        int miles = 7;
        double expected = centsPerMile*miles;
        //when
        double actual = payroll.calculateMileageReimbursement(miles);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void itShouldCreateOfferLetter() {
        //given
        String name = "Charlie";
        double wage = 12.56;
        String expected = "Hello " + name + ", We are pleased to offer you an hourly wage of " + wage;
        //when
        String actual = payroll.createOfferLetter(name, wage);
        //then
        assertEquals(expected, actual);
    }

}