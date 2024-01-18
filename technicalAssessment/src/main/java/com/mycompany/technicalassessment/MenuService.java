package com.mycompany.technicalassessment;

import java.util.Scanner;

public class MenuService {
    private final ValidationService validationService;
    private final IntegerToRomanService toRoman;
    private final RomanToIntegerService toNumber;

    public MenuService(ValidationService validationService, IntegerToRomanService toRoman, RomanToIntegerService toNumber) {
        this.validationService = validationService;
        this.toRoman = toRoman;
        this.toNumber = toNumber;
    }

    public void startMenu() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Hi! Welcome to my Technical Assessment");
            int option;
            do {
                displayMenuOptions();
                option = scanner.nextInt();
                scanner.nextLine();
                try {
                    processOption(option, scanner);
                } catch (IllegalArgumentException e) {
                    System.err.println("Error in validation: " + e.getMessage());
                }
            } while (option != 3);
        } catch (java.util.InputMismatchException e) {
            System.err.println("Invalid input " + e.getMessage());
        }
    }

    private void displayMenuOptions() {
        System.out.println("Please select an option: | 1.Integer to Roman | 2.Roman to Integer | 3.Exit");
    }

    private void processOption(int option, Scanner scanner) {
        switch (option) {
            case 1 -> processIntegerToRoman(scanner);
            case 2 -> processRomanToInteger(scanner);
            case 3 -> System.out.println("Bye!");
            default -> System.out.println("Invalid option. Please select a valid option.");
        }
    }

    private void processIntegerToRoman(Scanner scanner) {
        System.out.println("Please provide an integer: ");
        int integer = scanner.nextInt();
        scanner.nextLine(); // Consume newline left by nextInt()
        validationService.validateNumber(integer);
        String roman = toRoman.converterRoman(integer);
        System.out.println("The roman of " + integer + " is: " + roman);
    }

    private void processRomanToInteger(Scanner scanner) {
        System.out.println("Please provide a roman: ");
        String romanNum = scanner.nextLine();
        validationService.validateRoman(romanNum);
        int number = toNumber.convertToInteger(romanNum);
        System.out.println("The integer of " + romanNum + " is: " + number);
    }
}