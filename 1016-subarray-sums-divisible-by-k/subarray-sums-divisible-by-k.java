class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        int count=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        map.put(0, 1);
        int preSum=0;
        for(int i=0; i<n; i++) {
            preSum += nums[i];

            int rem = preSum%k;
            if(rem<0) {
                rem = rem + k;
            }
            if(map.containsKey(rem)) {
                count += map.get(rem);
                map.put(rem, map.getOrDefault(rem, 0)+1);
            }
            else {
                map.put(rem, map.getOrDefault(rem, 0)+1);
            }
        }
        return count;
    }
}