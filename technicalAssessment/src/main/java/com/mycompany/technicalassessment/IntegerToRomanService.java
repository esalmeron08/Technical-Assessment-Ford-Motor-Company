/**
 *
 * @author José Enrique Salmerón Leal
 *
 * With any integer, show the roman numeral
 *
 * At most up to 3000
 *
 */

package com.mycompany.technicalassessment;

public class IntegerToRomanService {
    private static final String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private static final int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private final ValidationService validationService;

    public IntegerToRomanService(ValidationService validationService) {
        this.validationService = validationService;
    }

    public String converterRoman(int number) {
        validationService.validateNumber(number);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            while (number >= numbers[i]) {
                result.append(romans[i]);
                number -= numbers[i];
            }
        }
        return result.toString();
    }
}
