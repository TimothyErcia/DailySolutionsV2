/*
2295. Replace Elements in an Array
You are given a 0-indexed array nums that consists of n distinct positive integers. Apply m operations to this array, where in the ith operation you replace the number operations[i][0] with operations[i][1].

It is guaranteed that in the ith operation:

operations[i][0] exists in nums.
operations[i][1] does not exist in nums.
Return the array obtained after applying all the operations.
*/
class Main {
    public static int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer, Integer> hashmap = new HashMap();
        for(int i=0; i<nums.length; i++) {
            hashmap.put(nums[i], i);
        }

        for(int j=0; j<operations.length; j++) {
            nums[hashmap.get(operations[j][0])] = operations[j][1];
            hashmap.put(operations[j][1], hashmap.get(operations[j][0]));   
        }

        return nums;
    }
    
    public static void main(String[] args) {
        int[] arr1 = {1,2,4,6};
        int[][] arr2 = {{1,3},{4,7},{6,1}};
        int[] arr3 = arrayChange(arr1, arr2);
        for(int i=0; i<arr3.length; i++) {
            System.out.println(arr3[i]);
        }
    }
}