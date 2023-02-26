package collectionframework;

import java.util.HashMap;
import java.util.Map;

public class UseHashMap {
    public static void main(String[] args) {
        // Specify key value object type
        //        <KEY, VALUE>
        HashMap<Integer, String> map= new HashMap<>();

        // add to map based on key and value
        map.put(1, "Number 1");
        map.put(2, "Number 2");
        map.put(3, "Number 3");
        map.put(4, "Number 4");

        for (Map.Entry m:map.entrySet()
             ) {
            System.out.println(m.getKey() + "    "+ m.getValue());
        }

        map.remove(4);
        System.out.println("**********\nafter removal of key 4");

        for (Map.Entry m:map.entrySet()
        ) {
            System.out.println(m.getKey() + "    "+ m.getValue());
        }

        map.replace(1,"New Value");
        System.out.println("*************************\nreplacing the first value");
        for (Map.Entry m:map.entrySet()
        ) {
            System.out.println(m.getKey() + "    "+ m.getValue());
        }

        System.out.println("Finding a specific element : "+map.get(2));
    }
}
