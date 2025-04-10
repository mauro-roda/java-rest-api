package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class CalculatorServiceTest {

    private CalculatorService calculatorService;

    @BeforeEach
    public void setUp() {
        calculatorService = new CalculatorService();
    }

    @Test
    public void testAdd() {
        BigDecimal result = calculatorService.add(new BigDecimal("5"), new BigDecimal("3"));
        assertEquals(new BigDecimal("8"), result);
    }

    @Test
    public void testSubtract() {
        BigDecimal result = calculatorService.subtract(new BigDecimal("5"), new BigDecimal("3"));

        assertEquals(new BigDecimal("2"), result);
    }

    @Test
    public void testMultiply() {
        BigDecimal result = calculatorService.multiply(new BigDecimal("5"), new BigDecimal("3"));
        assertEquals(new BigDecimal("15"), result);
    }

    @Test
    public void testDivide() {
        BigDecimal result = calculatorService.divide(new BigDecimal("6"), new BigDecimal("3"));
        assertEquals(new BigDecimal("2"), result);
    }

    @Test
    public void testDivideByZero() {
        try {
            calculatorService.divide(new BigDecimal("5"), new BigDecimal("0"));
        } catch (ArithmeticException e) {
            assertEquals("/ by zero", e.getMessage());
        }
    }
}
