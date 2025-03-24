/*
2148. Count Elements With Strictly Smaller and Greater Elements

Given an integer array nums, return the number of elements that have both a strictly smaller and a strictly greater element appear in nums.

*/


class Solution {
    public int countElements(int[] nums) {
        int counter = 0;
        int min = nums[0], max = 0;
        for(int i=0; i<nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        //Check if in range
        for(int i=0; i<nums.length; i++) {
            if(nums[i] < max && nums[i] > min) {
                counter++;
            }
        }

        return counter;
    }
}