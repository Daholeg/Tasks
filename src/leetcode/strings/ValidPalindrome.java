package leetcode.strings;

public class ValidPalindrome {
    public static void main(String[] args) {
//        Given a String, return true if it is a palindrome, or false otherwise.

//        Example1:
//        Input: s = "A man, a plan, a canal: Panama"
//        Output: true
//        Explanation: "amanaplanacanalpanama" is a palindrome.

//        Example2:
//        Input: s = "race a car"
//        Output: false
//        Explanation: "raceacar" is not a palindrome.


        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = "ab_a";

        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));
        System.out.println(isPalindrome(s3));
    }

    public static boolean isPalindrome(String s) {
        String temp = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] array = temp.toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
