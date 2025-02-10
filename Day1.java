/* 
1247. Minimum Swaps to Make Strings Equal 
You are given two strings s1 and s2 of equal length consisting of letters "x" and "y" only. Your task is to make these two strings equal to each other. You can swap any two characters that belong to different strings, which means: swap s1[i] and s2[j].

Return the minimum number of swaps required to make s1 and s2 equal, or return -1 if it is impossible to do so.
*/

class Solution {
    public int minimumSwap(String s1, String s2) {
        if(s1 == s2) {
            return 0;
        }

        if(s1.length() != s2.length()) {
            return -1;
        }

        int xyCounter = 0, yxCounter = 0;
        for(int i=0; i<s1.length(); i++) {
            if(s1.charAt(i) == 'x' && s2.charAt(i) == 'y') {
                xyCounter+=1;
            } else if(s1.charAt(i) == 'y' && s2.charAt(i) == 'x') {
                yxCounter+=1;
            }
        }
        
        int temp = ((xyCounter + yxCounter) % 2);
        int sumCounter = xyCounter + yxCounter;
        if(xyCounter == yxCounter) {
            sumCounter = 0;
        } else if((sumCounter % 2) == 0) {
            sumCounter /= 2;
        } else {
            sumCounter = -1;
        }
        
        return sumCounter;
        
    }
}
