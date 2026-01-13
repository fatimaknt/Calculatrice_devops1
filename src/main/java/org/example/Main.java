package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== CALCULATRICE ===");
        
        System.out.println("5 + 3 = " + Calculator.addition(5, 3));
        System.out.println("10 - 7 = " + Calculator.soustraction(10, 7));
        System.out.println("4 * 6 = " + Calculator.multiplication(4, 6));
        System.out.println("15 / 3 = " + Calculator.division(15, 3));
        
        try {
            System.out.println("5 / 0 = " + Calculator.division(5, 0));
        } catch (ArithmeticException e) {
            System.out.println("5 / 0 = Erreur: " + e.getMessage());
        }
        
        System.out.println("=== FIN ===");
    }
}
