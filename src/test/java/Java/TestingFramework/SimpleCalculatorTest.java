package Java.TestingFramework;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void addTwoNumbersTest(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(7,calculator.addTwoNumbers(2,5));
    }

}