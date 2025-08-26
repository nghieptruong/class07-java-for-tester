package javabasic;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //them vào cac gia tri 1 , 2 ,3 ,4 ,5
        int x = 1;
        list.add(x); // tham so can Wrapper class, AutoBoxing bọc cái kiểu dữ liệu cơ bản thành wrapper class
        //Interview: tai sao list.add(Integer i) cho phep add bien x co kieu du lieu co ban la int
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
//        System.out.println(list.get(0)); // in ra 1 phan tử ở vị trí đầu tiên (index = 0)
        System.out.println(list); // toString() giup in ra gia tri

        System.out.println("-------------");
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr);

    }
}
