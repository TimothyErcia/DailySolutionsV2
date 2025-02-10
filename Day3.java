/*
605. Can Place Flowers

Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
*/
class Main {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int max = flowerbed.length;
        int filledPot = 0, emptyPot = 0;
        for(int i=0; i<max; i++) {
            if(flowerbed[i] == 1) {
                filledPot++;
            } else if(flowerbed[i] == 0) {
                emptyPot++;
            }
        }
        int maxPot = filledPot + n;
        if(maxPot <= emptyPot) {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,0,0,0,1};
        System.out.println(canPlaceFlowers(arr, 1));
    }
}