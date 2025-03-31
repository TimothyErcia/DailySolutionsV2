/**
 * 3127. Make a Square with the Same Color
    You are given a 2D matrix grid of size 3 x 3 consisting only of characters 'B' and 'W'. Character 'W' represents the white color, and character 'B' represents the black color.

    Your task is to change the color of at most one cell so that the matrix has a 2 x 2 square where all cells are of the same color.

    Return true if it is possible to create a 2 x 2 square of the same color, otherwise, return false.
 */

class Solution {
    public boolean squareTraversal(char[][] grid, int i, int j) {
        if(grid[i][j] == grid[i+1][j+1] && (grid[i][j] == grid[i][j+1] || grid[i][j] == grid[i+1][j])) {
            return true;
        }
        return false;
    }

    public boolean canMakeSquare(char[][] grid) {
        if(
            squareTraversal(grid, 0, 0) ||
            squareTraversal(grid, 1, 0) ||
            squareTraversal(grid, 0, 1) ||
            squareTraversal(grid, 1, 1)
        ) {
            return true;
        }
        return false;
    }
}