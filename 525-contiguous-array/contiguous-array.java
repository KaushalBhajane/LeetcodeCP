class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> freq = new HashMap<>();
        int sum=0;
        int max=0;
        for(int i=0; i<n; i++) {
            if(nums[i]==0) {
                sum += -1;
            }
            else {
                sum += 1;
            }

            if(sum == 0) {
                max = Math.max(max, i+1);
                
            }
            if(freq.containsKey(sum)) {
                max = Math.max(max, i-freq.get(sum));
            }
            else {
                freq.put(sum, i);
            }
        }
        return max;

    }
}