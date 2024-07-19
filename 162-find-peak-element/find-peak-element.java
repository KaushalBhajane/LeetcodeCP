class Solution {
    public int findPeakElement(int[] nums) {
         int low=0, high=nums.length-1;
        int mid=low+(high-low)/2;
        while(low<high) {
            if(nums[mid]<nums[mid+1]) {
                low = mid+1;
            }
            else {
                high=mid;
            }
            mid=low+(high-low)/2;
        }
        return low;
    }
}