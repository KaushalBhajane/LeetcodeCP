class Solution {
    public boolean searchMatrix(int[][] array, int target) {
        Boolean found = foundElement(array, target);
        return found;
    }
    public boolean foundElement(int[][] matrix, int target) {
        int m=0, n;
        int r=0;
        int c= matrix[m].length-1;

        while(r<matrix.length && c>=0) {
            if(matrix[r][c] == target) {
                return true;
            }
            else if(matrix[r][c] < target) {
                r++;
            }
            else if(matrix[r][c] > target) {
                c--;
            }

        }
        return false;
    }
}