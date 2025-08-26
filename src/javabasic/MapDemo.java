package javabasic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("John", "Thomas", "Tim", "Tom", "John", "Thomas", "Jenny", "Jenny");

        Map<String, Integer> map = new HashMap<>();
        for(String s : list) {
            if(map.containsKey(s)) {
                int count = map.get(s) + 1;
                map.put(s, count);
                //ko co key, gán do map cai key do và count 1
            } else {
                map.put(s, 1);
            }
        }

        System.out.println(map.get("Thomas"));
    }
}
