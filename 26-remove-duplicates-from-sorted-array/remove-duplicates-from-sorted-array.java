class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int len=1;
        if(n==1) {
            return len;
        }
        int i=0, j=1;
        while(j<n) {
            if(nums[i] != nums[j]) {
                nums[len] = nums[j];
                len++;
                i++;
            }
            j++;
        }
        return len;
    }
}