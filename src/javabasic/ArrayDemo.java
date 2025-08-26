package javabasic;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[5];
//        System.out.println(arr[0]); // neu ko khoi tao gia tri thi mac dinh gan so 0
        //viet 1 vong lap for in het tat ca phan tu cua arr
        // arr.length // do dai cua mang
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("--------------");
        String[] arrStr = new String[5]; // neu ko khoi tao gia tri thi mac dinh gan null
        System.out.println(arrStr[0]);
        for (int i = 0; i < arrStr.length; i++) {
            System.out.println(arrStr[i]);
        }

        System.out.println("----------------");
        boolean[] b = new boolean[5]; // neu ko khoi tao gia tri thi mac dinh gan false
        System.out.println(b[0]);

        System.out.println("---------------");
        int[] arrInt = new int[5];
        arrInt[0] = 1;
        arrInt[1] = 10;
        arrInt[2] = 1;
        arrInt[3] = -1;
        arrInt[4] = -10;

        System.out.println("---------------");
        int[] arrInt2 = new int[]{1, 2, 3, 4, 5}; // cach 2:  khoi tao gia tri cho mang
        int[] arrInt3 = {1, 2, 3, 4, 5};

        System.out.println("------------------");
        int[] x = {1, 5, 7};
        int[] y = {1, 5, 7};
        //viet vong lap de so sanh tung phan tu cua mang co bang nhau hay ko ? 
        //bang nhau khi tat ca cac phan bang nhau
        //ko bang khi 1 trong cac phan khac nhau
        //ket qua:
        //in ra neu bang nhau: "2 mang bang nhau"
        //neu ko bang: "2 mang khac nhau"

//        boolean isEqual = false;
//        for (int i = 0; i < x.length; i++) {
//            if(x[i] == y[i]) {
//                isEqual = true;
//            } else {
//                isEqual = false;
//                break;
//            }
//        }
        System.out.println("----------");
        //vong lap for-each
        for (int z : x) {
            System.out.println(z);
        }

        System.out.println("================");

        boolean isEqual = true;
        for (int i = 0; i < x.length; i++) {
            if (x[i] != y[i]) {
                isEqual = false;
                break;
            }
        }
        //in ket qua
        if (isEqual)
            System.out.println("Bang nhau");
        else
            System.out.println("Khac nhau");

        System.out.println("--------------");
        int[][] arr2D = {
                {1, 2, 3, 4},
                {4, 5, 6, 7}
        };
//        System.out.println(arr2D.length); // số hàng

        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}
