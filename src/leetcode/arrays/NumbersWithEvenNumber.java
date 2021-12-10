package leetcode.arrays;

public class NumbersWithEvenNumber {
    public static void main(String[] args) {
        int[] array = new int[]{555,901,482,1771};
        System.out.println(findEvenNumbers(array));
    }

    public static int findEvenNumbers(int[] nums) {
        int count = 0;
        String[] strArray = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            strArray[i] = String.valueOf(nums[i]);
        }

        for (int i = 0; i < strArray.length; i++) {
            if(strArray[i].length() % 2 == 0){
                count ++;
            }
        }

        return count;
    }
}
