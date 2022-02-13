package leetcode.arrays;

public class MaxOfConsecutiveOnes {
    public static void main(String[] args) {
//        Given a binary array nums, return the maximum number of consecutive 1's in the array.

        int[] array = new int[]{1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(array));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        int temp;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                count ++;
                temp = count;
                if(temp > max){
                    max = temp;
                }
            }else if(nums[i] != 1){
                count = 0;
            }
        }

        return max;
    }
}
