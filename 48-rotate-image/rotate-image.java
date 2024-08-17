class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        mirror(matrix);
    }
    public void transpose(int[][] matrix) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=i; j<matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    public void mirror(int[][] matrix) {
        for(int row=0; row<matrix.length; row++) {
            int i=0;
            int j=matrix[0].length-1;
            while(i<j) {
                int temp = matrix[row][i];
                matrix[row][i] = matrix[row][j];
                matrix[row][j] = temp;
                i++;
                j--;
            }
        }
    }
}