package leetcode.arrays;

public class ReverseText {
    public static void main(String[] args) {
//      Swap words

        String str = "Hello World";

        String result = getReversedString(str);

        System.out.println(result);
    }

    public static String getReversedString(String str) {
        String[] array = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i = array.length - 1; i >= 0; i--){
            sb.append(array[i]);
            sb.append(" ");
        }

        String result = sb.toString().trim();
        return result;
    }
}
