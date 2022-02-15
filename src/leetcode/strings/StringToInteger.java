package leetcode.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringToInteger {
    public static void main(String[] args) {
//        Find Integer in String

//        Example:
//        Input: s = "4193 with words"
//        Output: 4193


        String str1 = "gdfgfdgdfg gdfg hfg ..hfg **ggfh  -456 hgfjhgj";
        String str2 = "4193 with words";
        findInteger(str1);
        findInteger(str2);
    }

    public static int findInteger(String s) {
        String temp = "";
        int result = 0;
        try {
            Pattern pattern = Pattern.compile("-?\\d+");
            Matcher matcher = pattern.matcher(s);

            while (matcher.find()) {
                temp = matcher.group();
            }

            result = Integer.parseInt(temp);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        return result;
    }
}
