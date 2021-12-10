package leetcode.arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] array = new int[]{3,1,2,4};
        // Output: [2,4,3,1]

        sortArrayByParity(array);
    }

    public static int[] sortArrayByParity(int[] nums) {
        int[] array = new int[nums.length];
        int temp;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if(nums[j] % 2 != 0){
                    temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            array[i] = nums[i];
        }

        return array;
    }
}
