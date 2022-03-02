package Java.TestingFramework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {
    @Test
    void fiftyPercentGrade(){
        var graderTest = new Grader();
        assertEquals('F', graderTest.determineLetterGrade(50));
    }
}

//remember- one test per scenario!
//if you run the tests with coverage, go to the Class your testing.
//green lines means that line was tested
//red means it was not