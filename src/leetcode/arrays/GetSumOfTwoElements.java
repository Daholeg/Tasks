package leetcode.arrays;

public class GetSumOfTwoElements {
    public static void main(String[] args) {
        int [] array = new int[]{2,3,5,7,7,13};
        int n = 12;

        System.out.println(getSumOfTwoElements(array, n));

        // Check if N is a sum of two elements of Array
    }


    public static boolean getSumOfTwoElements (int[] array, int n){
        int i = 0;
        int j = array.length - 1;

        for (int k = i; k < j; k++) {
            if (array[i] + array[j] > n){
                j--;
                continue;
            }
            else if (array[i] + array[j] < n){
                i++;
                continue;
            }
            else {
                return true;
            }
        }
        return false;
    }
}
