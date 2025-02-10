/*
283. Move Zeroes
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.
*/
class Solution {
   public static void moveZeroes(int[] nums) {
    if(nums[0] == 0 && nums.length == 1) {
            return;
        }

        int max = nums.length;
        for(int i=0; i<max; i++) {
            if(nums[i] == 0) {
                int j = i+1;
                while(j < max) {
                    if(nums[j] > 0) {
                        nums[i] = nums[j];
                        nums[j] = 0;
                        break;
                    }
                    j++;
                }
            }
        }
   } 
}
