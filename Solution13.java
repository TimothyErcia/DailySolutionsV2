/*
3306. Count of Substrings Containing Every Vowel and K Consonants II

You are given a string word and a non-negative integer k.

Return the total number of substrings of word that contain every vowel ('a', 'e', 'i', 'o', and 'u') at least once and exactly k consonants.
*/

class Solution {
    public int wordTraversal(String word, int k) {
        int endIndex = 5 + k;
        int counterValidator = 0;

        //ieaouqqieaouqq
        // ieaouq 1
        // eaouqq n
        // qieaou 1
        // ieaouq 1

        int index = 0;
        while(endIndex<=word.length()) {
            String sub = word.substring(index, endIndex);
            int nonVowelCount = 0;
            for(char c : sub.toCharArray()) {
                if(!isVowel(c)) {
                    nonVowelCount++;
                }
            }
            if(nonVowelCount == k) {
                counterValidator++;
                endIndex++;
                index++;
            } else {
                index+=5;
                endIndex = index + 5 + k;
            }
        }
        
        return counterValidator;
    }

    public boolean isVowel(char i) {
        return i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u';
    }

    public long countOfSubstrings(String word, int k) {
        return wordTraversal(word, k);
    }
}