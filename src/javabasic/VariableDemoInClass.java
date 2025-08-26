package javabasic;

import java.util.Scanner;

public class VariableDemoInClass {
    public static void main(String[] args) {
        /*
//        Demo khai bao bien
        int x = 1; // khai bao bien x có gia tri 1
        System.out.println(x); // hiển thị ra màn hình giá trị của biến x
                                // sout : phím tắt để gọi lệnh System.out.println()

        int y; // khai báo biến y
        y = 2; // gán giá trị cho y
        System.out.println(y);

        */

        //khai bao bien kieu chuoi
        String s = "Hello world";
        System.out.println(s);

        byte b = 1;
        System.out.println(Byte.MIN_VALUE); // lấy gia tri Min cua kieu byte
        System.out.println(Byte.MAX_VALUE); // lay gia tri Max cua kieu byte
//         b = -129; ==> loi
        // b = 128 ==> loi

//             -128        127
//        ------|----------|------
//           -129           128

        // Viet 1 chuong trinh cho phep dang ky ung tuyen. Yeu cau: nguoi lao dong trong do tuoi tu 18 -> 45
        //     18          45
//        ------|----------|------
//

//        int age = 18; // pass
//        age = 45; // pass
//        age = 20; //pass
//        age = 17; //failed
//        age = 46; //failed

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        try {
            int input = sc.nextInt();
            System.out.println("Your age: " + input);
        } catch(Exception e) {

        }

    }
}
