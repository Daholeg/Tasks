package leetcode.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllNumbersDisappearedInArray {
    public static void main(String[] args) {
        int[] array = new int[]{4,3,2,7,8,2,3,1};
//        Output: [5,6]

        System.out.println(findDisappearedNumbers(array));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(i + 1);
        }

        for (int num : nums) {
            set.remove(num);
        }

        list.addAll(set);

        return list;
    }
}
