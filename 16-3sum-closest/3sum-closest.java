class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int closest_sum = nums[0]+nums[1]+nums[2];
        for (int i = 0; i < n; i++) {
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int current_sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(target - current_sum) < Math.abs(target - closest_sum)) {
                    closest_sum = current_sum;
                }
                if(closest_sum == target) {
                    return closest_sum;
                }
                if(current_sum < target) {
                    left++;
                }
                else if(current_sum > target) {
                    right--;
                }
            }
        }
        return closest_sum;
    }
}