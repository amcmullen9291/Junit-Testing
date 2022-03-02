package Java.TestingFramework;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void addTwoNumbersTest(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(7,calculator.addTwoNumbers(2,5));
        //notes- don't depend on only one test to assert functionality
        assertTrue(calculator.addTwoNumbers(2,2) == 4);
        //because 2*2 equals 4 as well but that will not work for every case since we are adding

    }

    @Test
    void addTwoNumbersTest2(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(10,calculator.addTwoNumbers(3,7));
    }

}