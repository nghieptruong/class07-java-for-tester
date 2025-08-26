package javabasic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountElement {
    public static void main(String[] args) {
//        Input
        List<String> list = Arrays.asList("John", "Thomas", "Tim", "Tom", "John", "Thomas", "Jenny", "Jenny");
//        Xac dinh bao nhieu phan tu duy nhat: John, Thomas, Tim, Tom, Jenny
        Set<String> set = new HashSet<>(list); // John, Thomas, Tim, Tom, Jenny
        int size = set.size();
        String[][] result = new String[2][size];

        // gán tên
        int i = 0;
        for(String s : set) {
            result[0][i] = s;
            i++;
        }

        for(int j = 0; j < result.length-1; j++) {
            int count = 0;
            for(int z = 0; z < result[0].length; z++) {
                for(int k = 0; k < list.size(); k++) {
                    if (result[0][z].equals(list.get(k))) // kiem tra gap gia tri trung thi se tang len q
                        count++;
                }
                result[1][z] = String.valueOf(count);
                count = 0;
            }
        }

        for(int m = 0; m < result.length-1; m++) {
            for(int n = 0; n < result[m].length; n++) {
                System.out.println(result[m][n] + " = " + result[1][n]);
            }
        }
    }
}
// Danh sách : "John", "Thomas", "Tim, "Tom", "John", "Thomas"
// Yêu cầu: Đếm số lần xuất hiện của phần tu đó trong 1 danh sach
// Gợi ý:
// List<String> list = Arrays.asList( "John", "Thomas", "Tim, "Tom", "John", "Thomas")
// Kết quả:
// String[][] result;
//John = 2
// Thomas = 2
// Tim = 1
// Tom = 1
// Su dung: mang 2 chieu, arrayList, set

