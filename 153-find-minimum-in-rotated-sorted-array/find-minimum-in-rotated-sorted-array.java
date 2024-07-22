class Solution {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length-1; 
        int mid = low + (high-low)/2;
        
        while(low<high) {
            
            if(nums[mid] < nums[high]) {
                high = mid;
            }
            else {
                low = mid+1;
            }
            mid = low + (high-low)/2;
        }
        return nums[low];
    }
}