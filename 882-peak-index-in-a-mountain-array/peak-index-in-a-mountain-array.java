class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low=0, high=arr.length-1;
        int mid=low+(high-low)/2;
        while(low<high) {
            if(arr[mid]<arr[mid+1]) {
                low = mid+1;
            }
            else {
                high=mid;
            }
            mid=low+(high-low)/2;
        }
        return low;
    }
}