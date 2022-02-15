package codewars;

public class SumOfNthSeries {
    public static void main(String[] args) {
//        Task:
//        Write a function which returns the sum of following series upto nth term(parameter).
//                Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...
//        Rules:
//        Need to round the answer to 2 decimal places and return it as String.
//
//        If the given value is 0 then it should return 0.00
//
//        Only Natural Numbers as arguments.
//
//        Examples:(Input --> Output)
//        1 --> 1 --> "1.00"
//        2 --> 1 + 1/4 --> "1.25"
//        5 --> 1 + 1/4 + 1/7 + 1/10 + 1/13 --> "1.57"

        int number = 5;
        System.out.println(seriesSum(number));
    }

    public static String seriesSum(int n) {
        if(n == 0){
            return "0,00";
        }

        int i = 1;
        double temp = 1;
        double dividend = 1;
        double divider = 4;
        while (i < n) {
            temp = temp + dividend/divider;
            divider += 3;
            i++;
        }

        return String.format("%.2f", temp);
    }
}
