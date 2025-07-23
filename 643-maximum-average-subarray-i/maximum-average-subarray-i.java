class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        int right;
        for(right=0; right<k; right++) {
            sum += nums[right];
        }
        int maxSum=sum;
        int left=0;
        right=k;
        while(right < nums.length) {
            sum = sum - nums[left] + nums[right];
            maxSum = Math.max(sum, maxSum);
            left++;
            right++;
        }
        return (double) maxSum/k;
    }
}