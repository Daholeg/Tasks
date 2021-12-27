package leetcode.strings;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String str = "aacbb";
        System.out.println(firstUniqueCharIndex(str));


//        Input: s = "loveleetcode"
//        Output: 2
//
//        Input: s = "aabb"
//        Output: -1
    }

    public static int firstUniqueCharIndex(String s) {
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(s.indexOf(c) == s.lastIndexOf(c)) {
                return i;
            }
        }

        return -1;
    }
}
