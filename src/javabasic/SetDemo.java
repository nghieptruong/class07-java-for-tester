package javabasic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(1);
        System.out.println(set); // 1, 2

        System.out.println("----------------");

        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()) {
            int x = iterator.next();
            System.out.println(x);
        }

        System.out.println("--------------");
        for(Integer i : set) {
            System.out.println(i);
        }
    }
}
