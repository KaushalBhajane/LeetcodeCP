class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxArea = 0;
        int left=0, right=n-1;
        while(left<right) {
            int area = (right-left) * Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, area);
            if(height[left] < height[right]) {
                left++;
            }
            else {
                right--;
            }
        }
        return maxArea;
    }
}