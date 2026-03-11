class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int start=0, end=n-1;
        int index=end;
        int[] result = new int[n];
        while(start<=end && index>=0) {
            if(Math.abs(nums[start]) > nums[end]) {
                result[index] = nums[start]*nums[start];
                start++;
            }
            else {
                result[index] = nums[end]*nums[end];
                end--;
            }
            index--;
        }
        return result;
    }
}