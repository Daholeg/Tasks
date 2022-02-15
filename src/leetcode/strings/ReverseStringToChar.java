package leetcode.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ReverseStringToChar {
    public static void main(String[] args) throws IOException {
//        Reverse String

//        Example:
//        Input: s = ["h","e","l","l","o"]
//        Output: ["o","l","l","e","h"]


        String str = "hello";
        char[] array = str.toCharArray();
        reverseString(array);
    }

    public static void reverseString(char[] s) {
        char[] temp = new char[s.length];

        for (int i = s.length - 1, j = 0; i >= 0; i--, j++) {
            temp[j] = s[i];
        }

        System.arraycopy(temp, 0, s, 0, s.length);

        System.out.println(Arrays.toString(s));
    }
}
