package leetcode.strings;

import java.io.IOException;

public class ReverseString {
    public static void main(String[] args) throws IOException {
//        Reverse String

        String str = "hello";
        System.out.println(reverseString(str));
    }

    public static String reverseString(String str) {
        char[] temp = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : temp) {
            sb.append(c);
        }

        sb.reverse();

        return sb.toString();
    }
}
