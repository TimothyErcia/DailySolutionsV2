/*
2206. Divide Array Into Equal Pairs
You are given an integer array nums consisting of 2 * n integers.

You need to divide nums into n pairs such that:

Each element belongs to exactly one pair.
The elements present in a pair are equal.
Return true if nums can be divided into n pairs, otherwise return false.
*/

class Solution {
    public boolean divideArray(int[] nums) {
        if(nums.length % 2 != 0) {
            return false;
        }

        HashMap<Integer, Integer> hashmap = new HashMap();

        for(int i=0; i<nums.length; i++) {
            if(!hashmap.containsKey(nums[i])) {
                hashmap.put(nums[i], 1);
            } else {
                int value = hashmap.get(nums[i]);
                hashmap.put(nums[i], value+=1);
            }
        }

        for(int value : hashmap.values()) {
            if(value % 2 != 0) {
                return false;
            }   
        }

        return true;
    }
}