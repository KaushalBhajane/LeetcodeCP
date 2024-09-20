class Solution {
    public int longestPalindrome(String s) {
        int[] upper = new int[26];
        int[] lower = new int[26];
        for(char ch:s.toCharArray()) {
            if(ch >= 'a') {
                lower[ch-'a']++;
            }
            else {
                upper[ch-'A']++;
            }
        }
        int odd = 0;
        int count = 0;
        for(int i=0; i<26; i++) {
            if(lower[i]%2 == 0) {
                count = count + lower[i];
            } else {
                count+=lower[i]-1;
                odd = 1;
            }
            if(upper[i]%2 == 0) {
                count+=upper[i];
            } else {
                count+=upper[i]-1;
                odd = 1;
            }
        }
        return count+odd;
    }
}