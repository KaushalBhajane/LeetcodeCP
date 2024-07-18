import java.util.*;
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int firstOcc = findFirstOcc(nums, target);
        if(firstOcc==-1) {
            return list;
        }
        for(int i=firstOcc; i<nums.length && nums[i] == target; i++) {
            list.add(i);
        }
        return list;

    }
    public int findFirstOcc(int[] nums, int key) {
        int low = 0, high = nums.length-1;
        int mid = low + (high-low)/2;
        int ans=-1;
        while(low<=high) {
            if(nums[mid]==key) {
                ans=mid;
                high=mid-1;
            }
            else if(key>nums[mid]) {
                low=mid+1;
            }
            else {
                high=mid-1;
            }
            mid = low + (high-low)/2;
        }
        return ans;
    }
}