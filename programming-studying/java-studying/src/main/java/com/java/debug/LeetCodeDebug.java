package com.java.debug;

public class LeetCodeDebug {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 2, 0};
        solution.sortColors(nums);
        System.out.println(Utils.printIntArray(nums));
    }
}

class Solution {
    public void sortColors(int[] nums) {
        int length = nums.length;
        int left = 0;
        int right = length - 1;
        int i = 0;
        while (i <= right) {
            if (nums[i] == 0) {
                swap(nums, i, left);
                left++;
                i++;
            } else if (nums[i] == 2) {
                swap(nums, i, right);
                right--;
            } else {
                i++;
            }
        }
    }

    private void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}