import java.util.*;
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> counter = new HashMap<>();
        for(int i:arr) {
            counter.put(i, counter.getOrDefault(i, 0)+1);
        }
        HashSet<Integer> set = new HashSet<>(counter.values());
        return counter.size() == set.size();

    }
}