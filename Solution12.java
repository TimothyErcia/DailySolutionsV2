/* 
3394. Check if Grid can be Cut into Sections

You are given an integer n representing the dimensions of an n x n grid, with the origin at the bottom-left corner of the grid. You are also given a 2D array of coordinates rectangles, where rectangles[i] is in the form [startx, starty, endx, endy], representing a rectangle on the grid. Each rectangle is defined as follows:

(startx, starty): The bottom-left corner of the rectangle.
(endx, endy): The top-right corner of the rectangle.
Note that the rectangles do not overlap. Your task is to determine if it is possible to make either two horizontal or two vertical cuts on the grid such that:

Each of the three resulting sections formed by the cuts contains at least one rectangle.
Every rectangle belongs to exactly one section.
Return true if such cuts can be made; otherwise, return false.
*/

class Solution {
    public boolean checkValidCuts(int n, int[][] rectangles) {
        int gapCount = 0;
        //X 15, 02, 35, 04 -> 0 0 1 2 3 4 5 5
        //Y 02, 24, 23, 45 -> 0 2 2 2 3 4 4 5
        
        //X 01, 23, 02, 34 -> 0 0 1 2 2 3 3 4
        //Y 01, 04, 23, 03 -> 0 0 0 1 2 3 3 4
        ArrayList<Integer> Xarr = new ArrayList();
        ArrayList<Integer> Yarr = new ArrayList();

        for(int i=0; i<rectangles.length; i++) {
            int[] current = rectangles[i];
            Xarr.add(current[0]);
            Yarr.add(current[1]);
            Xarr.add(current[2]);
            Yarr.add(current[3]);
        }

        Collections.sort(Xarr);
        Collections.sort(Yarr);
        
        int pointer = 0;
        for(int i=0; i<Xarr.size(); i++) {    
            if(Xarr.get(i) != Yarr.get(i)) {
                gapCount++;
                if((Xarr.get(i)+Yarr.get(i)) == pointer) {
                    return false;
                }
                pointer = Xarr.get(i)+Yarr.get(i);
            }
        }
        return gapCount >= 2;
    }
}