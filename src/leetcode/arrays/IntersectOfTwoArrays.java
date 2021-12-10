package leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class IntersectOfTwoArrays {
    public static void main(String[] args) {
        int[] array1 = new int[]{1,2,2,1};
        int[] array2 = new int[]{1,1};

        intersect(array1, array2);

//        Input: nums1 = [1,2,2,1], nums2 = [2,2]
//        Output: [2,2]


//        Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//        Output: [4,9]
//        Explanation: [9,4] is also accepted.
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        // First insane solution..

        List<Integer> list = new ArrayList<>();

        if(nums1.length < nums2.length) {
            for (int i = 0; i < nums1.length; i++) {
                if (nums2.length == 1 && nums2[0] == nums1[i]) {
                    list.add(nums2[0]);
                    break;
                }
                for (int j = 0; j < nums2.length; j++) {
                    if (nums2[j] == nums1[i]) {
                        list.add(nums2[j]);
                        nums2[j] = nums2[0];
                        break;
                    }
                }
            }
        }else if(nums1.length > nums2.length){
            for (int i = 0; i < nums2.length; i++) {
                if (nums1.length == 1 && nums1[0] == nums2[i]) {
                    list.add(nums2[0]);
                    break;
                }
                for (int j = 0; j < nums1.length; j++) {
                    if (nums1[j] == nums2[i]) {
                        list.add(nums1[j]);
                        nums1[j] = nums1[0];
                        break;
                    }
                }
            }
        }else{
            for (int i = 0; i < nums1.length; i++) {
                if (nums2.length == 1 && nums2[0] == nums1[i]) {
                    list.add(nums2[0]);
                    break;
                }
                for (int j = 0; j < nums2.length; j++) {
                    if (nums2[j] == nums1[i]) {
                        list.add(nums2[j]);
                        break;
                    }
                }
            }
        }

        int[] result = new int[list.toArray().length];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }


        for (int i : result) {
            System.out.print(i + " ");
        }

        return result;


        // Second normal solution

//        Arrays.sort(nums1);
//        Arrays.sort(nums2);
//        List<Integer> list = new ArrayList<>();
//        int i = 0;
//        int j = 0;
//        while(i < nums1.length && j < nums2.length){
//            if (nums1[i] > nums2[j]){
//                j++;
//            }else if (nums1[i] < nums2[j]){
//                i++;
//            }else {
//                list.add(nums1[i]);
//                i++;
//                j++;
//            }
//        }
//
//        int[] result = new int[list.toArray().length];
//        for (int k = 0; k < list.size(); k++) {
//            result[k] = list.get(k);
//        }
//
//        for (int k : result) {
//            System.out.print(k + " ");
//        }
//
//        return result;
    }
}
