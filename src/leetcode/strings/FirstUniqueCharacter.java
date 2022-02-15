package leetcode.strings;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
//        Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1

//        Example1:
//        Input: s = "loveleetcode"
//        Output: 2

//        Example2:
//        Input: s = "aabb"
//        Output: -1

        String str = "aacbb";
        System.out.println(firstUniqueCharIndex(str));
    }

    public static int firstUniqueCharIndex(String s) {
        try {
            for(int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if(s.indexOf(c) == s.lastIndexOf(c)) {
                    return i;
                }
            }
        } catch (NullPointerException e) {
            return -1;
        }
        return -1;
    }
}
