package leetcode.strings;

public class ReverseString {
    public static void main(String[] args) {
        String str = "hello";
        char[] array = str.toCharArray();
        reverseString(array);

//        Input: s = ["h","e","l","l","o"]
//        Output: ["o","l","l","e","h"]
    }

    public static void reverseString(char[] s) {
        char[] temp = new char[s.length];

        for (int i = s.length - 1, j = 0; i >= 0; i--, j++) {
            temp[j] = s[i];
        }

        System.arraycopy(temp, 0, s, 0, s.length);

        for (char c : s) {
            System.out.print(c + " ");
        }
    }
}
