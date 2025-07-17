class Solution {
    public int[] sortedSquares(int[] nums) {
        int start=0, end=nums.length-1;
        int index=nums.length-1;
        int[] result = new int[nums.length];
        while(start<=end && index>=0) {
            if(Math.abs(nums[start])>nums[end]) {
                result[index]=nums[start]*nums[start];
                start++;
            }
            else {
                result[index]=nums[end]*nums[end];
                end--;
            }
            index--;
        }
        return result;
    }
}