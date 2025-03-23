class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int l=0, h=n-1, m=l+(h-l)/2;
        while(l<=h) {
            if(nums[m] == target) {
                return m;
            }
            else if(nums[m] < target) {
                l++;
            }
            else {
                h--;
            }
            m=l+(h-l)/2;
        }
        return m;
    }
}