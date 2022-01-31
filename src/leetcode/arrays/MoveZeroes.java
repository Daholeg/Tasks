package leetcode.arrays;

public class MoveZeroes {
    public static void main(String[] args) {
//        Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

        int [] array = new int[]{1,0,0,2,3,5,0};
        moveZeroes(array);
    }

    public static void moveZeroes(int[] nums) {
        int temp;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if(nums[j] == 0){
                    temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}
