package codewars;

import java.util.StringJoiner;

public class NumberInExpandedForm {
    public static void main(String[] args) {
//        You will be given a number and you will need to return it as a string in Expanded Form. For example:
//
//        int = 12: Should return "10 + 2"
//        int = 42: Should return "40 + 2"
//        int = 70304: Should return "70000 + 300 + 4"
//        NOTE: All numbers will be whole numbers greater than 0.

        int num = 7030;
        System.out.println(getExtendedNum(num));
    }

    public static String getExtendedNum (int num){
        String temp = String.valueOf(num);
        StringBuilder sb = new StringBuilder();
        char[] chArray = temp.toCharArray();
        int tempInt;
        for (int i = 0; i < chArray.length; i++) {
            tempInt = (int) (Math.pow(10, chArray.length - 1 - i));
            if(Character.getNumericValue(chArray[i]) != 0) {
                sb.append(Character.getNumericValue(chArray[i]) * tempInt);
                sb.append(" + ");
            }
        }
        if(sb.length() > 0){
            sb.deleteCharAt(sb.length() - 2);
        }

        return sb.toString().trim();
    }
}
