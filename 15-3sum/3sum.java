class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Set<List<Integer>> outerList = new HashSet<>();
        for(int i=0; i<n-2; i++) {
            Set<Integer> uniqueEle = new HashSet<>();
            for(int j=i+1; j<n; j++) {
                int comp = -nums[i]-nums[j];
                if(uniqueEle.contains(comp)) {
                    List<Integer> innerList = new ArrayList<>();
                    innerList.add(comp);
                    innerList.add(nums[i]);
                    innerList.add(nums[j]);
                    innerList.sort(Comparator.reverseOrder()); // or sort(null) coz in set of lists ([-1,1,0], [-1,0,1]) are diff due to order.
                    outerList.add(innerList);
                }
                uniqueEle.add(nums[j]);
            }
            
        }
        return new ArrayList<>(outerList);
    }
}