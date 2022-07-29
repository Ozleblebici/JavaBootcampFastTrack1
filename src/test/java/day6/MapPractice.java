package day6;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapPractice {


    public static void main(String[] args) {

        Map<String,Integer> mapObj = new HashMap<>();

        mapObj.put("Z", 50);
        mapObj.put("Z", 100); // dublicated one -> updating value!!!
        mapObj.put("E", 200);
        mapObj.put("C", 300);
        mapObj.put(null, null);


        // iter : foreach loop
        System.out.println("KeySet Method: !");
        for (String s : mapObj.keySet()) {  // keySet() returns all key values as Set<String> obj...
            System.out.println("s = " + s);
        }

        System.out.println("Values Method: !");
        for (Integer value : mapObj.values()) { // values() returns all values as Collection obj
            System.out.println("value = " + value);
        }

        System.out.println("Entryset Method: !");
        for (Map.Entry<String, Integer> entry : mapObj.entrySet()) {

            System.out.println("entry.getKey() = " + entry.getKey()); // getKey method returns a i.key !!
            System.out.println("entry.getValue() = " + entry.getValue()); // getValue method returns a i.values !!
        }


    }
}
