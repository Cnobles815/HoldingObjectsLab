package nobles.christopher.HoldingObjectsLab;

import java.util.Map;
import java.lang.Object;
import java.util.Objects;

/**
 * Created by christophernobles on 9/28/16.
 */
public class PhoneBook {

    Map<String, Integer> listing;

    public int lookUp(String name){
        return listing.get(name);
    }

    public int addEntry(String name, int number){
         return listing.put(name, number);

    }

    public void removeEntry(String name){
        listing.remove(name);

    }

    public static Object reverseLookup(Map listing, Object number){
        for (Object o : listing.keySet()){
            if (listing.get(o).equals(number)) {
                return o;
            }
        }
        return null;
    }



}
