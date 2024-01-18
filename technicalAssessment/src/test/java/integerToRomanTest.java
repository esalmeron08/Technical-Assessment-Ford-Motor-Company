
import com.mycompany.technicalassessment.IntegerToRoman;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author José Enrique Salmerón Leal
 * 
 * TESTS ---> With any integer, show the roman numeral
 * 
 * 
 */

import static org.junit.jupiter.api.Assertions.*;

public class integerToRomanTest {
    public IntegerToRoman service;
    @BeforeEach
    public void setUp(){
        this.service = new IntegerToRoman();
    }
    @Test
    public void integerToRomanOne(){assertEquals("I",service.converterRoman(1));}
    @Test
    public void integerToRomanFive(){
        assertEquals("V",service.converterRoman(5));
    }
    @Test
    public void integerToRomanTen(){
        assertEquals("X",service.converterRoman(10));
    }
    @Test
    public void integerToRomanTwenty(){
        assertEquals("XX",service.converterRoman(20));
    }
    @Test
    public void integerToRomanThreeT(){assertEquals("MMM",service.converterRoman(3000));}
    @Test
    public void convertToRoman_NumberGreaterThan3000_ThrowsIllegalArgumentException() {assertThrows(IllegalArgumentException.class, () -> service.converterRoman(3001));}
    @Test
    public void convertToRoman_Zero_ThrowsIllegalArgumentException() {assertThrows(IllegalArgumentException.class, () -> service.converterRoman(0));}
    @Test
    public void convertToRoman_Negative_ThrowsIllegalArgumentException() {assertThrows(IllegalArgumentException.class, () -> service.converterRoman(-1));}
}
