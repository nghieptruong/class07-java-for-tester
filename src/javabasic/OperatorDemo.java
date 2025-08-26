package javabasic;

public class OperatorDemo {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int result = 1 % 2; // ==> ra ket qua là 1
        System.out.println(result);

        int a = 1;
        a += 2; // viết tắt của biểu thức a = a + 2 ==> a = 1 + 2 = 3
        System.out.println(a); // 3

        boolean z = (a == 1);
        System.out.println(z);

        System.out.println(a == 1);

        a = -1;
        int b = 2;
        boolean d = (a > 0) && (b > 0); // ==> true
        System.out.println(d);

        System.out.println("-----------------");
        boolean p = a < 0; // true
        System.out.println(!p); // trả ra false

        String e = (a < 0) ? "so am" : "so duong hoac bang 0";
        System.out.println(e);

        int i = 0;
        String e2 = (i < 0) ? "so am" : "so duong hoac bang 0";
        System.out.println(e2);

        String e3 = false ? "so am" : "so duong hoac bang 0";
        System.out.println(e3);

        System.out.println("------------------------");
        int num1 = 1;
        num1++; // tang 1 don vi
        // tăng sau, gán trước
        System.out.println(num1); // ra 2

        int num2 = 1;
        num2 += 1; // ra 2 ==> num2 = num2 + 1
        System.out.println(num2); // ra 2

        System.out.println("-------------------------");
        int k = 1;
        int l = k++; // k tăng sau, k gán cho l trước ==> l = ? -> 1 ==> k = 2
        System.out.println(k); // k ra số mấy 2
        System.out.println(l); // ra số 1


        //Cau hỏi phng van: Khác nhau của a++ và ++a ?
//        a = 2;
//        b = a++; // se làm 2 bước
//        // tang sau (2), gán trước (1)
//        //b1: gán truoc b = 2 ==> print b --> 2
//        //b2: tang sau a + 1 ==> 2 + 1 = 3
//        System.out.println("a = " + a); //3
//        System.out.println("b = " + b); // 2

        a = 2;
        b = ++a; // a tang trước, a gán cho b sau
        System.out.println("a = " + a); // 3
        System.out.println("b = " + b); // 3

    }
}
