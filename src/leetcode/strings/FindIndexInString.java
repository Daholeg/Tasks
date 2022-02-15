package leetcode.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindIndexInString {
    public static void main(String[] args) {
//        Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack

//        Example 1:
//        Input: haystack = "hello", needle = "ll"
//        Output: 2

//        Example 2:
//        Input: haystack = "aaaaa", needle = "bba"
//        Output: -1

//        Example 3:
//        Input: haystack = "mississippi", needle = "issip"
//        Output: 4


        String haystack1 = "hello";
        String needle1 = "ll";

        String haystack2 = "aaaaa";
        String needle2 = "bba";

        String haystack3 = "";
        String needle3 = "";

        String haystack4 = "mississippi";
        String needle4 = "issip";

        System.out.println(findFirstIndexInHaystack(haystack1, needle1));
        System.out.println(findFirstIndexInHaystack(haystack2, needle2));
        System.out.println(findFirstIndexInHaystack(haystack3, needle3));
        System.out.println(findFirstIndexInHaystack(haystack4, needle4));
    }

    public static int findFirstIndexInHaystack(String haystack, String needle) {
        if(needle.length() == 0){
            return 0;
        }

        String temp = "";
        Pattern pattern = Pattern.compile(needle + "\\w+");
        Matcher matcher = pattern.matcher(haystack);

        while (matcher.find()){
            temp = matcher.group();

            if(haystack.contains(temp)){
                return haystack.length() - temp.length();
            }
        }

        return -1;
    }
}
