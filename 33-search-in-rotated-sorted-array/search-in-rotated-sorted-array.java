class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int pivot = findPivot(nums, n);
        if(nums[pivot] <= target && target <= nums[n-1]) {
            return binarySearch(nums, pivot, n-1, target);
        }
        else {
            return binarySearch(nums, 0, pivot-1, target);
        }
    }

    public int findPivot(int[] nums, int n) {
        int low = 0, high = n - 1;
        int mid = low + (high - low) / 2;
        while (low < high) {
            if (nums[mid] < nums[high]) {
                high = mid;
            } else {
                low = mid+1;
            }
            mid = low + (high - low) / 2;
        }
        return low;
    }

    public int binarySearch(int[] nums, int s, int e, int target) {
        int low = s, high = e;
        int mid = low + (high - low) / 2;
        int ans = -1;
        while (low <= high) {
            if (nums[mid] == target) {
                ans = mid;
                return ans;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            mid = low + (high - low)/2;
        }
        return ans;
    }
}