package codewars;

public class LongestConsec {
    public static void main(String[] args) {
//        strarr = ["tree", "foling", "trashy", "blue", "abcdef", "uvwxyz"], k = 2
//
//        Concatenate the consecutive strings of Strarr by 2, we get:
//
//        treefoling   (length 10)  concatenation of strarr[0] and strarr[1]
//        folingtrashy ("      12)  concatenation of strarr[1] and strarr[2]
//        trashyblue   ("      10)  concatenation of strarr[2] and strarr[3]
//        blueabcdef   ("      10)  concatenation of strarr[3] and strarr[4]
//        abcdefuvwxyz ("      12)  concatenation of strarr[4] and strarr[5]
//
//        Two strings are the longest: "folingtrashy" and "abcdefuvwxyz".
//        The first that came is "folingtrashy" so longest_consec(strarr, 2) should return "folingtrashy".

        String[] strarr = new String[]{"tree", "foling", "trashy", "blue", "abcdef", "uvwxyz"};
        int k = 2;

        System.out.println(longestConsec(strarr, k));
    }

    public static String longestConsec(String[] strarr, int k) {
        if(k <= 0){
            return "";
        }

        int tempK;
        String result = "";

        for (int i = 0; i <= strarr.length - k; i++) {
            StringBuilder sb = new StringBuilder();
            tempK = k;
            while (tempK != 0){
                sb.append(strarr[i]);
                i++;
                tempK -= 1;
            }
            i = i - k;
            if(sb.toString().length() > result.length()){
                result = sb.toString();
            }
        }

        return result;
    }
}

