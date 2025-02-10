/*
2114. Maximum Number of Words Found in Sentencess
A sentence is a list of words that are separated by a single space with no leading or trailing spaces.

You are given an array of strings sentences, where each sentences[i] represents a single sentence.

Return the maximum number of words that appear in a single sentence.
*/

class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(int i=0; i<sentences.length; i++) {
            String[] arrTemp = sentences[i].split(" ");
            if(max < arrTemp.length) {
                max = arrTemp.length;
            }
        }
        return max;
    }
}