
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author José Enrique Salmerón Leal
 * 
 * TESTS ---> With any integer, show the roman numeral
 * 
 * 
 * 
 */

import static org.junit.jupiter.api.Assertions.*;

public class integerToRomanTest {
    
    public void integerToRomanOne(){
        assertEquals("I",integerToRoman.converterRoman(1));
    }
    public void integerToRomanFive(){
        assertEquals("V",integerToRoman.converterRoman(5));
    }
    public void integerToRomanTen(){
        assertEquals("X",integerToRoman.converterRoman(10));
    }
    public void integerToRomanTwenty(){
        assertEquals("XX",integerToRoman.converterRoman(20));
    }
    
}
