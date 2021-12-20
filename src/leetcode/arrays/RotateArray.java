package leetcode.arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7,5,7};
        int step = 4;


//        Input: nums = [1,2,3,4,5,6,7], k = 3
//        Output: [5,6,7,1,2,3,4]
//        Explanation:
//        rotate 1 steps to the right: [7,1,2,3,4,5,6]
//        rotate 2 steps to the right: [6,7,1,2,3,4,5]
//        rotate 3 steps to the right: [5,6,7,1,2,3,4]
    }

    public static void rotateVersion1(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int temp = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
                if(nums[j] == nums[0]){
                    nums[0] = temp;
                }
            }
        }
    }

    public static void rotateVersion2(int[] nums, int k) {
        int[] result = new int[nums.length];

        System.arraycopy(nums, nums.length - k, result, 0, k);
        System.arraycopy(nums, 0, result, k, nums.length - k);
        System.arraycopy(result, 0, nums, 0, result.length);
    }
}
