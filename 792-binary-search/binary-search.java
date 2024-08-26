class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        int mid = low+(high-low)/2;
        int ans = binarySearch(nums, low, high, target);
        return ans;
    }
    public int binarySearch(int[] nums, int low, int high, int target) {
        if(low>high) {
            return -1;
        }
        int mid = low+(high-low)/2;
        if(nums[mid] == target) {
            return mid;
        }
        else if(nums[mid]>target) {
            return binarySearch(nums, low, mid-1, target);
        }
        else {
            return binarySearch(nums, mid+1, high, target);
        }
    }
}