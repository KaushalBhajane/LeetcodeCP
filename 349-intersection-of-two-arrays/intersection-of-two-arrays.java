import java.util.HashSet;
import java.util.Arrays;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> result = new HashSet<>();
        HashSet<Integer> Set = new HashSet<>();
        for(int i:nums2) {
            Set.add(i);
        }
        for(int i:nums1) {
            if(Set.contains(i)) {
                result.add(i);
            }
        }
        int[] resultArray = new int[result.size()];
        int i = 0;
        for (int num : result) {
            resultArray[i++] = num;
        }
        
        return resultArray;
    }
}