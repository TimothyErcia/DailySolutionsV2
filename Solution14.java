/*
532. K-diff Pairs in an Array
Given an array of integers nums and an integer k, return the number of unique k-diff pairs in the array.

A k-diff pair is an integer pair (nums[i], nums[j]), where the following are true:

0 <= i, j < nums.length
i != j
|nums[i] - nums[j]| == k
Notice that |val| denotes the absolute value of val.
*/

class Solution {
    public int findPairs(int[] nums, int k) {
        int counter = 0;
        
        HashSet<Integer> hashSet = new HashSet();
        HashSet<Integer> duplicates = new HashSet();
        for(int i : nums) {
            if(hashSet.contains(i)) {
                duplicates.add(i);
            }            
            hashSet.add(i);
        }
        System.out.println(hashSet);

        for(int i : hashSet) {
            if(k > 0 && hashSet.contains(i+k)) {
                counter++;
            }
        }

        if(counter == 0) {
            return duplicates.size();
        }

        return counter;
    }
}