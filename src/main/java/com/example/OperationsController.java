package com.example;

import java.math.BigDecimal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperationsController {

    // Sum endpoint
    @GetMapping("/sum")
    public BigDecimal sum(@RequestParam BigDecimal a, @RequestParam BigDecimal b) {
        return a.add(b);
    }

    // Subtraction endpoint
    @GetMapping("/subtract")
    public BigDecimal subtract(@RequestParam BigDecimal a, @RequestParam BigDecimal b) {
        return a.subtract(b);
    }

    // Multiplication endpoint
    @GetMapping("/multiply")
    public BigDecimal multiply(@RequestParam BigDecimal a, @RequestParam BigDecimal b) {
        return a.multiply(b);
    }

    // Division endpoint
    @GetMapping("/divide")
    public BigDecimal divide(@RequestParam BigDecimal a, @RequestParam BigDecimal b) {
        if (b.compareTo(BigDecimal.ZERO) == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a.divide(b, 10, BigDecimal.ROUND_HALF_UP); // 10 decimal places of precision
    }
}
