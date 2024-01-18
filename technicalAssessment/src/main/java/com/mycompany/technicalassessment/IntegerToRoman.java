package com.mycompany.technicalassessment;

/**
 *
 * @author José Enrique Salmerón Leal
 *
 * With any integer, show the roman numeral
 *
 * At most up to 3000
 *
 */
public class IntegerToRoman {
    private static final String[] roman = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
    private static final int[] numbers = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

    public String converterRoman(int number) {
        String result = "";
        if (number <= 0 || number > 3000) {
            throw new IllegalArgumentException("Out of range");
        }

        for (int i = 0; i < numbers.length; i++) {
            while (number >= numbers[i]) {
                result += roman[i];
                number -= numbers[i];
            }
        }

        return result;
    }
}
