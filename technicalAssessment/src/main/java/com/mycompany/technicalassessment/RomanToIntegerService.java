package com.mycompany.technicalassessment;
public class RomanToIntegerService {
    private static final String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private static final int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    private final ValidationService validationService;

    public RomanToIntegerService(ValidationService validationService) {
        this.validationService = validationService;
    }

    public int convertToInteger(String roman) {
        validationService.validateRoman(roman);
        int result = 0;
        int counter = 0;
        for (int i = 0; i < romans.length; i++) {
            while (roman.startsWith(romans[i], counter)) {
                result += numbers[i];
                counter += romans[i].length();
            }
        }
        return result;
    }
}
