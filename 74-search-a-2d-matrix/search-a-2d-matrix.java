class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        int low=0, high=row*col-1;
        int mid=low+(high-low)/2;
            while(low<=high) {
                int element = matrix[mid/col][mid%col];
                if(element == target) {
                    return true;
                }
                else if(element < target) {
                    low = mid+1;
                }
                else {
                    high = mid-1;
                }
                mid = low+(high-low)/2;
            }
            return false;
        
    }
}