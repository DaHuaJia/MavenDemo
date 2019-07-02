package com.krt;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author DHJ
 */
public class Solution {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};
        Scanner in = new Scanner(System.in);
        System.out.print("请输入姆目标金额：");
        int target = in.nextInt();

        int[] result = twoSum(nums, target);
        System.out.println(nums[result[0]] + "==" + nums[result[1]]);

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int result[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }

}
