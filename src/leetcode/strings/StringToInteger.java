package leetcode.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringToInteger {
    public static void main(String[] args) {
        String str1 = "gdfgfdgdfg gdfg hfg ..hfg **ggfh  -456 hgfjhgj";
        String str2 = "4193 with words";
        findInteger(str1);
        findInteger(str2);


//        Input: s = "4193 with words"
//        Output: 4193
//        Explanation:
//        Step 1: "4193 with words" (no characters read because there is no leading whitespace)
//         ^
//        Step 2: "4193 with words" (no characters read because there is neither a '-' nor '+')
//         ^
//        Step 3: "4193 with words" ("4193" is read in; reading stops because the next character is a non-digit)
//             ^
//        The parsed integer is 4193.
//        Since 4193 is in the range [-231, 231 - 1], the final result is 4193.
    }

    public static int findInteger(String s) {
        String temp = "";
        int result;
        Pattern pattern = Pattern.compile("-?\\d+");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()){
            temp = matcher.group();
        }

        result = Integer.parseInt(temp);

        System.out.println(result);

        return result;
    }
}
