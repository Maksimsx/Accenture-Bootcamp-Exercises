package Exercises22;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTestingTest {

    @Test
    void twoPlusTwoShouldEqualFour(){
        UnitTesting calculator = new UnitTesting();
        assertEquals(4, calculator.add(2,2));
    }

    @Test
    void threePlusSevenShouldEqualTen(){
        UnitTesting calculator = new UnitTesting();
        assertEquals(10, calculator.add(3,7));
    }

}