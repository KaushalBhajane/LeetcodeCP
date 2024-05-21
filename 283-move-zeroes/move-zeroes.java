class Solution {
    public static int[] moveZeroes(int[] nums) {
        int j=-1;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]==0) {
                j=i;
                break;
            }
        }
        if(nums.length < 2) {
            return nums;
        }
        if(j==-1) {
            return nums;
        }
        int n=nums.length;
        for(int i=j+1; i<n; i++) {
            if(nums[i]!=0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        return nums;
    }
}