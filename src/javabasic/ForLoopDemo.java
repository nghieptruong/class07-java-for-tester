package javabasic;

import java.util.Scanner;

public class ForLoopDemo {
    public static void main(String[] args) {
//        for(int i = 5; i < 10; i++) {
//            System.out.println("Hello Java");
//        }

//        //Bai Tap: Lap từ 0 toi 9, cong het so chan
//        int sum = 0;
//        for(int i = 0; i <= 9; i++) {
//            if(i % 2 == 0)
//                sum += i; // sum = sum + i;
//        }
//        System.out.println(sum);
//        //in ra bien sum???


        /* In mau. nhap n = 5

         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * * * * *

         */
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        // chay vong for
//        for(int i = 0; i < n; i++) {
//            for(int j = 0; j < n; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // ko muon in ra so 3.  In ra so 0, 1, 2 , 4. continue?
//        int i = 0;
//        do {
//            if(i == 3) {
//                i++;
//                continue;
//            } else {
//                System.out.println(i);
//            }
//            i++;
//        } while(i < 5);

        for(int i = 0; i < 5; i++) {
            if(i == 3)
                return;
            System.out.println(i);
        }
        System.out.println("See you again!");
    }
}
