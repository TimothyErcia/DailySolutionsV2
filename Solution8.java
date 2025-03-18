
/*
1138. Alphabet Board Path
On an alphabet board, we start at position (0, 0), corresponding to character board[0][0].

Here, board = ["abcde", "fghij", "klmno", "pqrst", "uvwxy", "z"], as shown in the diagram
*/

class Solution {
    public String alphabetBoardPath(String target) {
        String[] board = {"abcde", "fghij", "klmno", "pqrst", "uvwxy", "z"};
        StringBuilder actions = new StringBuilder();
        
        int i = 0, j = 0, index = 0;
        while (index != target.length()) {
            int targetCharCount = (int) target.charAt(index);
            int lastCharCount = (int) board[i].charAt(board[i].length()-1);
            int startingCharCount = (int) board[i].charAt(0);
            int currentCharCount = (int) board[i].charAt(j);
            
            if(startingCharCount < targetCharCount && lastCharCount < targetCharCount) {
                actions.append("D");
                i++;
            } else if(startingCharCount > targetCharCount && lastCharCount > targetCharCount) {
                actions.append("U");
                i--;
            } else {
                if(currentCharCount < targetCharCount) {
                    actions.append("R");
                    j++;
                } else if(currentCharCount == targetCharCount) {
                    actions.append("!");
                    index++;
                } else {
                    actions.append("L");
                    j--;
                }
            }
            
        }
        return actions.toString();
    }
}