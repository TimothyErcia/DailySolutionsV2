/*
3264. Final Array State After K Mulitplication Operations
You are given an integer array nums, an integer k, and an integer multiplier.

You need to perform k operations on nums. In each operation:

Find the minimum value x in nums. If there are multiple occurrences of the minimum value, select the one that appears first.
Replace the selected minimum value x with x * multiplier.
Return an integer array denoting the final state of nums after performing all k operations.
*/

class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i=0; i<k; i++) {
            int currentMin = nums[0], pointer = 0;
            
            for(int j=0; j<nums.length; j++) {
                if(currentMin > nums[j]) {
                    currentMin = nums[j];
                    pointer = j;
                }
            }
            nums[pointer] = currentMin * multiplier;
        }
        return nums;
    }
}