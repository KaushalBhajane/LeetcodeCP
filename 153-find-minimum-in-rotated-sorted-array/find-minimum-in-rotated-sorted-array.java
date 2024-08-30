class Solution {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length-1; 
        int mid = low + (high-low)/2;
        int index = searchPivot(nums, low, high);
        return nums[index];
    }
    public int searchPivot(int[] nums, int low, int high) {
        if(low == high) {
            return low;
        }
        int mid = low+(high-low)/2;
        if(nums[mid] < nums[high]) {
            int index = searchPivot(nums, low, mid);
            return index;
        }
        else {
            int index = searchPivot(nums, mid+1, high);
            return index;
        }
    }
}