package leetcode.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlusOne {
    public static void main(String[] args) {
//        Increment the large integer by one and return the resulting array of digits.

//        Example1:
//        Input: digits = [1,2,3]
//        Output: [1,2,4]
//        Explanation: The array represents the integer 123.
//        Incrementing by one gives 123 + 1 = 124.
//        Thus, the result should be [1,2,4].

//        Example2:
//        Input: digits = [9]
//        Output: [1,0]
//        Explanation: The array represents the integer 9.
//        Incrementing by one gives 9 + 1 = 10.
//        Thus, the result should be [1,0].

        int[] array = new int[]{9,9};

        plusOne(array);
    }

    public static int[] plusOne(int[] digits) {
        List<Integer> list = new ArrayList<>();
        int sum;
        int temp;

        String text = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < digits.length; i++) {
            sb.append((digits[i]));
        }
        text = sb.toString();
        sum = Integer.parseInt(text);
        sum += 1;

        while (sum > 0){
            temp = sum % 10;
            list.add(temp);
            sum /= 10;
        }

        Collections.reverse(list);

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
