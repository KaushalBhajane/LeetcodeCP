import java.util.*;
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> result = new ArrayList<>();
        int low = 0, high = nums.length-1;
        int firstOcc = findFirstOcc(nums, low, high, target);
        if(firstOcc == -1) {
            return result;
        }
        for(int i=firstOcc; i<nums.length && target == nums[i]; i++) {
            result.add(i);
        }
        return result;
    }
    public int findFirstOcc(int[] nums, int low, int high, int target) {
        int firstOcc = -1;
        if(low>high) {
            return -1;
        }
        int mid = low+(high-low)/2;
        if(nums[mid] == target) {
            firstOcc = findFirstOcc(nums, low, mid-1, target);
            if(firstOcc == -1) {
                return mid;
            }
            else {
                return firstOcc;
            }
        }
        else if(target > nums[mid]) {
            return findFirstOcc(nums, mid+1, high, target);
        }
        else {
            return findFirstOcc(nums, low, mid-1, target);
        }
    }
}