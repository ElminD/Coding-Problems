// You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
// You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. 
// DO NOT allocate another 2D matrix and do the rotation.
// Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
// Output: [[7,4,1],[8,5,2],[9,6,3]]

// Runtime: 0 ms, faster than 100.00% of Java online submissions for Rotate Image.
// Memory Usage: 42.8 MB, less than 53.48% of Java online submissions for Rotate Image.

class Solution {
    public void rotate(int[][] matrix) {
        int l = 0;
        int r = matrix.length - 1;
        Collection
        while ( l < r )
        {
            for(int i = 0; i < r - l; i++)
            {
                int top = l;
                int bottom = r;
                 //save the topleft
                int topLeft = matrix[top][l + i];

                //move bottom left into top left
                matrix[top][l + i] = matrix[bottom - i][l];

                // move bottom right into bottom left
                matrix[bottom - i][l] = matrix[bottom][r - i];

                // move top right into bottom right
                matrix[bottom][r - i] = matrix[top + i][r];

                // move top left into top right
                matrix[top + i][r] = topLeft;
                
            }
            
            r -= 1;
            l += 1;
        }
    }
}
