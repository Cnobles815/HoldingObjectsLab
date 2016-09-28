package nobles.christopher.HoldingObjectsLab;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by christophernobles on 9/28/16.
 */
public class DisplayTEST {

    @Test
    void printStringTEST(){
        Display display = new Display();
        String expectedValue = "Bob.";
        String actualValue = display.printString("Bob");
        assertEquals("The value should be Bob.", expectedValue, actualValue);
    }

    @Test
    void printIntTEST(){
        Display display = new Display();
        int expectedValue = 3;
        int actualValue = display.printInt(3);
        assertEquals("The value should be 3.", expectedValue, actualValue);
    }
}
