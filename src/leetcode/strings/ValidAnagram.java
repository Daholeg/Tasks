package leetcode.strings;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String right1 = "anagram";
        String right2 = "nagaram";

        String wrong1 = "rat";
        String wrong2 = "car";

        System.out.println(isAnagram(right1, right2));
        System.out.println(isAnagram(wrong1, wrong2));


//        Input: s = "anagram", t = "nagaram"
//        Output: true
//
//        Input: s = "rat", t = "car"
//        Output: false
    }

    public static boolean isAnagram(String s, String t) {
        char[] chArray1 = s.toCharArray();
        char[] chArray2 = t.toCharArray();
        Arrays.sort(chArray1);
        Arrays.sort(chArray2);

        String tempS = new String(chArray1);
        String tempT = new String(chArray2);

        return tempS.equals(tempT);
    }
}
