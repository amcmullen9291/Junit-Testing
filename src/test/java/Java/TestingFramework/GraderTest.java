package Java.TestingFramework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.system.OutputCaptureRule;

import static org.junit.jupiter.api.Assertions.*;


class GraderTest {
    @Test
    void fiftyPercentGrade(){
        var graderTest = new Grader();
        assertEquals('F', graderTest.determineLetterGrade(50));
        assertNotEquals(0 ,graderTest.determineLetterGrade(50));
        assertEquals('F', graderTest.determineLetterGrade(0));
    }

    @Test
    void sixtyPercentGrade(){
        var graderTest = new Grader();
        assertEquals('D', graderTest.determineLetterGrade(60));
        assertNotEquals(0 ,graderTest.determineLetterGrade(50));
    }

    @Test
    void seventyPercentGrade(){
        var graderTest = new Grader();
        assertEquals('C', graderTest.determineLetterGrade(70));
        assertNotEquals(0 ,graderTest.determineLetterGrade(50));
    }

    @Test
    void eightyPercentGrade(){
        var graderTest = new Grader();
        assertEquals('B', graderTest.determineLetterGrade(80));
        assertNotEquals(0 ,graderTest.determineLetterGrade(50));
    }


    @Test
    void ninetyPercentGrade(){
        var graderTest = new Grader();
        assertEquals('A', graderTest.determineLetterGrade(90));
        assertNotEquals((Character) null,graderTest.determineLetterGrade(90));
    }//remember char or string?

    @Test
    void negativePercentGradeShouldReturnError(){
        var graderTest = new Grader();
        assertThrows(IllegalArgumentException.class, () ->{
            graderTest.determineLetterGrade(-1);
        });
        assertThrows(IllegalArgumentException.class, () ->{
            graderTest.determineLetterGrade(110);
        });
    }


}

//remember- one test per scenario!
//if you run the tests with coverage, go to the Class your testing.
//green lines means that line was tested
//red means it was not