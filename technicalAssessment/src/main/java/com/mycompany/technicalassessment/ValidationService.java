package com.mycompany.technicalassessment;

public class ValidationService {
    public void validateNumber(int number) {
        if (number <= 0 || number > 3000) {
            throw new IllegalArgumentException("Out of range");
        }
    }
}
