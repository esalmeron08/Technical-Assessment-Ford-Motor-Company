package com.mycompany.technicalassessment;
public class TechnicalAssessment {

    public static void main(String[] args) {
        ValidationService validationService = new ValidationService();
        IntegerToRomanService toRoman = new IntegerToRomanService(validationService);
        RomanToIntegerService toNumber = new RomanToIntegerService(validationService);
        MenuService menuService = new MenuService(validationService, toRoman, toNumber);
        menuService.startMenu();
    }
}
