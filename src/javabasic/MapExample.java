package javabasic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "John");
        map.put(10, "Tom");

//        Set<Map.Entry<Integer, String>> set = map.entrySet();
//        Iterator<Map.Entry<Integer, String>> iter = set.iterator();
//        while(iter.hasNext()) {
//            Map.Entry<Integer, String> entry = iter.next();
//            int key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println("key = " + key + ", value = " + value);
//        }

        Set<Map.Entry<Integer, String>> set = map.entrySet();
        for(Map.Entry<Integer, String> entry : set) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key = " + key + ", value = " + value);
        }
    }
}
