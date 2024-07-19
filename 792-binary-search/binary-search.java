class Solution {
    public int search(int[] nums, int target) {
        int low=0, high=nums.length-1;
        int mid = low+(high-low)/2;
        int ans=-1;
        while(low<=high) {
            if(nums[mid]==target) {
                ans=mid;
                return ans;
            }
            else if(target>nums[mid]) {
                low=mid+1;
            }
            else {
                high=mid-1;
            }
            mid = low + (high-low)/2;
        }
        return ans;
    }
}