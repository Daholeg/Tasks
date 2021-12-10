package leetcode.arrays;

public class ReverseText {
    public static void main(String[] args) {
        String S = "Hello World";

        // Swap words

        String[] array = S.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i = array.length - 1; i >= 0; i--){
            sb.append(array[i]);
            sb.append(" ");
        }

        System.out.println(sb.toString().trim());

    }
}
