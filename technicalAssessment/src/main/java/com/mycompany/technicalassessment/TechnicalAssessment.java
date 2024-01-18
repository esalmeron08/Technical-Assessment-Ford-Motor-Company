
package com.mycompany.technicalassessment;

import java.util.Scanner;

/**
 *
 * @author José Enrique Salmerón Leal
 * 
 */

public class TechnicalAssessment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ValidationService validationService = new ValidationService();
        IntegerToRomanService toRoman = new IntegerToRomanService(validationService);
        try {
            System.out.println("Hi! Welcome to my Technical Assessment");
            System.out.println("Please provide an integer: ");
            int number = scanner.nextInt();
            String roman = toRoman.converterRoman(number);
            System.out.println("The roman of " + number + " is: " + roman);
        }catch(IllegalArgumentException e) {
            System.err.println("Error in validation: " + e.getMessage());
        }
    }
}
