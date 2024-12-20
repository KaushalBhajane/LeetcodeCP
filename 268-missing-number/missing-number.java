class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int N = n+1;
        int xor1=0, xor2=0;
        for(int i=0; i<n; i++) {
            xor1=xor1^nums[i];
        }
        for(int i=0; i<N; i++) {
            xor2=xor2^i;
        }
        return xor1^xor2;
    }
}