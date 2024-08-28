class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        int mid= low+(high-low)/2;
        int[] ans = new int[2];
        ans[0] = firstPos(nums, low, high, target);
        ans[1] = lastPos(nums, low, high, target);
        return ans;
    }
    public int firstPos(int[] nums, int low, int high, int target) {
        if(low>high) {
            return -1;
        }
        int mid = low+(high-low)/2;
        if(nums[mid]==target) {
            int firstOcc = firstPos(nums, low, mid-1, target);
            if(firstOcc == -1) {
                return mid;
            }
            else {
                return firstOcc;
            }
        }
        else if(target > nums[mid]) {
            return firstPos(nums, mid+1, high, target);
        }
        else {
            return firstPos(nums, low, mid-1, target);
        }
    }
    public int lastPos(int[] nums, int low, int high, int target) {
        if(low>high) {
            return -1;
        }
        int mid = low+(high-low)/2;
        if(nums[mid]==target) {
            int lastOcc = lastPos(nums, mid+1, high, target);
            if(lastOcc == -1) {
                return mid;
            }
            else {
                return lastOcc;
            }
        }
        else if(target > nums[mid]) {
            return lastPos(nums, mid+1, high, target);
        }
        else {
            return lastPos(nums, low, mid-1, target);
        }
    }
}