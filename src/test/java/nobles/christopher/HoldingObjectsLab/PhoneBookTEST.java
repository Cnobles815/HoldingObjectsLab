package nobles.christopher.HoldingObjectsLab;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by christophernobles on 9/28/16.
 */
public class PhoneBookTEST {

    @Test
    public void lookUpTEST(){
        PhoneBook phoneBook = new PhoneBook();
        int expectedValue = 3;
        int actualValue = phoneBook.lookUp("Jeff");
        assertEquals("The value should be 3", expectedValue, actualValue);
    }

//    @Test
//    public void addEntry(){
//        PhoneBook phoneBook = new PhoneBook();
//        Integer expectedValue = "Jeff" , 8675309;
//        Integer actualValue = phoneBook.addEntry("Jeff", 8675309);
//        assertEquals("The value should be Jeff , 8675309", expectedValue, actualValue);
//    }

    @Test
    public void reverseLookUpTEST(){
        PhoneBook phoneBook = new PhoneBook();
        Object expectedValue = "a";
        Object actualValue = phoneBook.reverseLookup(listing, 999).toString();
        assertEquals("The value should be a" , expectedValue, actualValue);
    }



}
