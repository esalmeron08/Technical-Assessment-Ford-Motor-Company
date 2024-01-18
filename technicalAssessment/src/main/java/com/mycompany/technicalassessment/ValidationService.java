package com.mycompany.technicalassessment;

public class ValidationService {
    public void validateNumber(int number) {
        if (number <= 0 || number > 3000) {
            throw new IllegalArgumentException("Out of range");
        }
    }
    public void validateRoman(String roman){
        if (roman == null || roman.isEmpty()) {
            throw new IllegalArgumentException("Text cannot be null or empty");
        }
    }
}
