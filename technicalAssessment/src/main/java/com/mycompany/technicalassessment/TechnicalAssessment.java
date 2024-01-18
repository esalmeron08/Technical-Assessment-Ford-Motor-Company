
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
        IntegerToRoman toRoman = new IntegerToRoman();
        System.out.println("Hi! Welcome to my Technical Assessment");
        System.out.println("Please provide an integer: ");
        int number =scanner.nextInt();
        String roman = toRoman.converterRoman(number);
        System.out.println("The roman of "+number+" is: "+roman);
    }
}
