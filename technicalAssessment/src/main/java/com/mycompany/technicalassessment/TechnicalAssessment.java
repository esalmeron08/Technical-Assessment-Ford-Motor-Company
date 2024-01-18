
package com.mycompany.technicalassessment;

import java.util.Scanner;

/**
 *
 * @author José Enrique Salmerón Leal
 * 
 */

public class TechnicalAssessment {

    public static void main(String[] args) {
        ValidationService validationService = new ValidationService();
        IntegerToRomanService toRoman = new IntegerToRomanService(validationService);
        RomanToIntegerService toNumber = new RomanToIntegerService(validationService);
        MenuService menuService = new MenuService(validationService, toRoman, toNumber);
        menuService.startMenu();
    }

}
