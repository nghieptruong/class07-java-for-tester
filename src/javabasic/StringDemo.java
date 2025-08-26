package javabasic;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "Hello World"; // String is immutable (bất biến)
        System.out.println(System.identityHashCode(s1)); // reference vung nho 1791741888
        String s2 = "Hello World";
        System.out.println(System.identityHashCode(s2)); // 1791741888

        String s3 = new String("Hello World"); // ko xài
        String s4 = s3.intern(); // move tu heap sang string pool
        System.out.println(System.identityHashCode(s3)); // 1595428806

        System.out.println(s1 == s2); // true ==> address trong memory (-862545276 == -862545276) ==> so sanh 2 dia chi tren vung nho
        System.out.println(s1 == s3); // Interview: true hay false? Tai sao? ==> false ==> 1791741888 == 1595428806 ==> so sanh 2 dia chi tren vung nho
        System.out.println(s1 == s3.intern()); // move tu heap sang string pool
        System.out.println(s1 == s4); // true
        System.out.println();


        //Tom lai:
        // - khi bao so sanh chuoi tuyet doi ko xai == operator (object voi == operator, define lai cach so sanh)
        // - khi so sanh 2 gia tri chuoi phải dung equal method

        System.out.println("=========================");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s2.equals(s3)); // true
        System.out.println(s2.equalsIgnoreCase("HELLO World")); // true



//        Kieu du lieu co ban
//        int x = 1;
//        int y = 1;
//        System.out.println(x == y); // true

        System.out.println("--------------------");
        String a = "Hello";
        String b = "Hello";
        String c = "Hfllo";
        String d = "Hdllo";
        //compareTo
        System.out.println(a.compareTo(b)); // 0 --> gia tri 2 chuoi bang nhau dua tren Unicode (Ascii)
        System.out.println(a.compareTo(c)); // -1 --> chuoi Hello < Hfllo
        System.out.println(a.compareTo(d)); // ?? --> chuoi Hello > Hdllo
        char charValue = 'H'; // in ra 72
        System.out.println((int) charValue); // in ra Ascii value

        //Interview
        String number = "34";
        System.out.println(number + 1); // "34" noi choi voi 1 ==> 341
        int x = Integer.parseInt(number);
        System.out.println(x + 1); // 35

    }
}
