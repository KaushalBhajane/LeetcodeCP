class Solution {
    public int[] searchRange(int[] nums, int target) {
        int f=-1;
        int l=-1;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]==target) {
                f=i;
                break;
            }
        }
        for(int i=nums.length-1; i>=0; i--) {
            if(nums[i]==target) {
                l=i;
                break;
            }
        }
        int[] ans= new int[2];
        ans[0] =f;
        ans[1] =l;
        return ans;
    }
}