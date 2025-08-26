package javabasic;


import java.util.Scanner;

public class VariableTypeDemo {
    public static void main(String[] args) {
        /* Customer Requirements: Nhà máy cần tuyển lao động phổ thông. Xây dựng ứng dụng cho phép
        lao động đăng ký ứng tuyển
            Yêu cầu:
                - Nhập họ tên (String)
                - Nhập tuổi (int) . Độ tuổi 18 - 45 . Nếu ko cho range, thì in ra thông báo "Invalid age"
                - Nhập chiều cao (int)
                - Nhập cân nặng (int)
                - Nhập tình trạng hôn nhân (boolean)
        */

        System.out.println("==============================");
        System.out.println("|       Register Form        |");
        System.out.println("==============================");

        Scanner scanner = new Scanner(System.in); // doi tuong input

        System.out.println("Your name: ");
        String name = scanner.nextLine(); // nhập từ bàn phím kiểu chuỗi

        int age = -1;
//        System.out.println("Your age: ");
//        while(true) {
//            System.out.println("Your age: ");
//            String input = scanner.nextLine(); // "34"
//            try {
//                age = Integer.parseInt(input); //chuyen doi chuoi sang so : "34" -> 34
//                break;
//            } catch(Exception e) {
//                System.out.println("Invalid age " + e.getMessage());
//            }
//        }
        boolean validInput = false;
        do {
            try {
                System.out.println("Your age: ");
                String input = scanner.nextLine();
                age = Integer.parseInt(input); //chuyen doi chuoi sang so : "34" -> 34
                validInput = true;
            } catch(Exception e) {
                System.out.println("Invalid age " + e.getMessage());
            }
        } while(!validInput);
        System.out.println("Your address: ");
        String address = scanner.nextLine();

//        int age = scanner.nextInt(); // nhập từ bàn phím kiểu số
        //            18             45
        //-------------|--------------|--------------
        if(age < 18 || age > 45) {
            System.out.println("Invalid age");
            System.out.println("Your age: " + age);
        } else {
            System.out.println("Valid age");
        }

        System.out.println("Your height (meter): ");
        float height = scanner.nextFloat(); //nhap tu ban phim kieu so thực float

        System.out.println("Your weight (kg): ");
        float weight = scanner.nextFloat(); //nhap tu ban phim kieu so thực float

        System.out.println("Are you married?");
        boolean isMarried = scanner.nextBoolean(); // nhap tu ban phim kieu boolean
        scanner.nextLine();

        System.out.println("Do you want to send? (y/n)");
        char answer = scanner.nextLine().charAt(0); // nhap tu ban phim kieu String, sau do lay ky tu tai index 0

        System.out.println();
        System.out.println("--- Thank You For Your Infomation ---");
        System.out.println("Your name: " + name);
        System.out.println("Your age: " + age);
        System.out.println("Your height (meter): " + height);
        System.out.println("Your weight (kg): " + weight);
        System.out.println("Are you married? " + isMarried);
        System.out.println("Do you want to send? (y/n) " + answer);
    }
}
