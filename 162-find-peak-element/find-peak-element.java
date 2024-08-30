class Solution {
    public int findPeakElement(int[] nums) {
        int low=0, high=nums.length-1;
        int target = peakElementSearch(nums, low, high);
        return target;
    }
    public int peakElementSearch(int[] nums, int low, int high) {
        if(low == high) {
            return low;
        }
        int mid = low+(high-low)/2;
        if(nums[mid] < nums[mid+1]) {
            int target = peakElementSearch(nums, mid+1, high);
            return target;
        }
        else {
            int target = peakElementSearch(nums, low, mid);
            return target;
        }
    }
}