class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int n = nums.length;
        int prod=1, count=0, index=-1;
        for(int i=0; i<n; i++) {
            if(nums[i] != 0) {
                prod*=nums[i];
            }
            else {
                count++;
                index=i;
            }
        }

        if(count > 1) {
            return res;
        }
        if(count==1) {
            res[index]=prod;
            return res;
        }
        for(int i=0; i<n; i++) {
            res[i] = prod/nums[i];
        }
        return res;
    }

}