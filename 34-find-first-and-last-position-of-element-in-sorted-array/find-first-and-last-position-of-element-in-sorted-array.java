class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result= new int[2];
        result[0] = firstPos(nums, target);
        result[1] = lastPos(nums, target);
        return result;
    }
    public int firstPos(int[] nums, int k) {
        int low=0, high= nums.length-1;
        int mid = low + (high-low)/2;
        int ans=-1;
        while(low<=high) {
            if(nums[mid]==k) {
                ans=mid;
                high=mid-1;
            }
            else if(k>nums[mid]) {
                low=mid+1;
            }
            else if(k<nums[mid]) {
                high = mid-1;
            }
            mid = low + (high-low)/2;
        }
        return ans;
    }
    public int lastPos(int[] nums, int k) {
        int low=0, high= nums.length-1;
        int mid = low + (high-low)/2;
        int ans=-1;
        while(low<=high) {
            if(nums[mid]==k) {
                ans=mid;
                low=mid+1;
            }
            else if(k>nums[mid]) {
                low=mid+1;
            }
            else if(k<nums[mid]) {
                high = mid-1;
            }
            mid = low + (high-low)/2;
        }
        return ans;
    }
}