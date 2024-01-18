import com.mycompany.technicalassessment.RomanToIntegerService;
import com.mycompany.technicalassessment.ValidationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RomanToIntegerServiceTest {
    private RomanToIntegerService toNumber;

    @BeforeEach
    public void setUp() {
        ValidationService validationService = new ValidationService();
        toNumber = new RomanToIntegerService(validationService);
    }

    @Test
    public void testConvertToInteger_ValidRoman() {
        assertEquals(4, toNumber.convertToInteger("IV"));
        assertEquals(14, toNumber.convertToInteger("XIV"));
        assertEquals(3000, toNumber.convertToInteger("MMM"));
        assertEquals(123, toNumber.convertToInteger("CXXIII"));
    }

    @Test
    public void testConvertToInteger_NullRoman() {
        assertThrows(IllegalArgumentException.class, () -> toNumber.convertToInteger(null));
    }

    @Test
    public void testConvertToInteger_EmptyRoman() {
        assertThrows(IllegalArgumentException.class, () -> toNumber.convertToInteger(""));
    }

}
