class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> freq = new HashMap<>();
        int prefSum=0;
        int count=0;
        
        for(int i=0; i<n; i++) {
            prefSum += nums[i];

            if(prefSum == k) {
                count++;
            }

            if(freq.containsKey(prefSum-k)) {
                count += freq.get(prefSum-k);
            }
            freq.put(prefSum, freq.getOrDefault(prefSum, 0)+1);
        }
        return count;
    }
}