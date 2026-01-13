package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void TstAddition() {
        assertEquals(4, Calculator.addition(2, 2));
    }
    
    @Test
    void Testmultiplication() {
        assertEquals(25, Calculator.multiplication(5, 5));
    }
    
    @Test
    void Testsoustraction() {
        assertEquals(1, Calculator.soustraction(3, 2));
    }
    
    @Test
    void Testdivision() {
        assertEquals(2, Calculator.division(4, 2));
    }
    
    @Test
    void TestDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> {
            Calculator.division(5, 0);
        });
    }
}
