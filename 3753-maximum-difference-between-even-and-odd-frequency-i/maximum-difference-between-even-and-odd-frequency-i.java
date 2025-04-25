class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        int n = s.length();
        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;
        for(int i=0; i<n; i++) {
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0; i<n; i++) {
            if(freq[s.charAt(i)-'a']%2 == 0) {
                minEven = Math.min(minEven, freq[s.charAt(i)-'a']);
            }
            else {
                maxOdd = Math.max(maxOdd, freq[s.charAt(i)-'a']);
            }
        }
        return maxOdd-minEven;
    }
}