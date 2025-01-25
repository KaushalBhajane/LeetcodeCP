class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int closest_sum = Integer.MAX_VALUE;
        for(int i=0; i<n-2; i++) {
            for(int j=i+1; j<n-1; j++) {
                for(int k=j+1; k<n; k++) {
                    int current_sum = nums[i]+nums[j]+nums[k];
                    if(Math.abs(target-current_sum) < Math.abs(target-closest_sum)) {
                        closest_sum = current_sum;
                    }
                }
            }
        }
        return closest_sum;
    }
}