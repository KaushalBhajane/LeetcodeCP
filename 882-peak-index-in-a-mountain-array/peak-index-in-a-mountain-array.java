class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low=0, high=arr.length-1;
        int mid=low+(high-low)/2;
        int result = peakIndexSearch(arr, low, high);
        return result;
    }
    public int peakIndexSearch(int[] arr, int low, int high) {
        if(low == high) {
            return low;
        }
        int mid = low+(high-low)/2;
        if(arr[mid] < arr[mid+1]) {
            int index = peakIndexSearch(arr, mid+1, high);
            return index;
        }
        else {
            int index = peakIndexSearch(arr, low, mid);
            return index;
        }
    }
}