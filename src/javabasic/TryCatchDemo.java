package javabasic;

public class TryCatchDemo {
    public static void main(String[] args) {
//        try {
//            System.out.println(1 / 0); // dong se gay loi
//        } catch (ArithmeticException e) {
//            System.out.println("loi chia 0");
//        }

//        try {
//            System.out.println(1 / 0); // dong se gay loi
//        } catch (Exception e) {
//            System.out.println("loi chia 0");
//        } finally {
//            System.out.println("Thank you!");
//        }

        try {
            System.out.println(1 / 1); // ko co loi
        } catch (Exception e) {
            System.out.println("loi chia 0");
        } finally {
            System.out.println("Thank you!");
        }

    }
}
