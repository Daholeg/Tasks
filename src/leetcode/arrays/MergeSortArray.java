package leetcode.arrays;

import java.util.Arrays;

public class MergeSortArray {
    public static void main(String[] args) {
        int[] array1 = new int []{1,2,3,0,0,0};
        int[] array2 = new int []{2,5,6};


        //Output: [1,2,2,3,5,6]

        merge(array1, array2);

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
    }

    public static void merge(int[] nums1, int[] nums2) {
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if(nums1[i] == 0 && nums2[j] != 0){
                    nums1[i] = nums2[j];
                    nums2[j] = 0;
                }
            }
        }
        Arrays.sort(nums1);
    }
}
