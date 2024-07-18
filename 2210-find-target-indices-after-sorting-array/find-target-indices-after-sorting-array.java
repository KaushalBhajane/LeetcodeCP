class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int firstIndex = binarySearch(nums, target);
        if (firstIndex == -1) {
            return list;
        }
        for (int i = firstIndex; i < nums.length && nums[i] == target; i++) {
            list.add(i);
        }
        
        return list;
    }
    public int binarySearch(int[] nums, int k) {
        int low=0, high= nums.length-1;
        int mid = low + (high-low)/2;
        int ans=-1;
        while(low<=high) {
            if(nums[mid]==k) {
                ans=mid;
                high=mid-1;
            }
            else if(k>nums[mid]) {
                low=mid+1;
            }
            else if(k<nums[mid]) {
                high = mid-1;
            }
            mid = low + (high-low)/2;
        }
        return ans;
    }
}