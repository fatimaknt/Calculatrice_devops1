package org.example;

public class Calculator {
    public static int addition(int a, int b) {
        return a + b;
    }
    
    public static int multiplication(int a, int b) {
        return a * b;
    }
    
    public static int soustraction(int a, int b) {
        return a - b;
    }
    
    public static int division(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division par zéro");
        }
        return a / b;
    }
}
