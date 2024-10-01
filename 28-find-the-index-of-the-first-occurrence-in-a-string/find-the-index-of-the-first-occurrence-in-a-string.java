class Solution {
    public int strStr(String haystack, String needle) {
        int first=0, second=0;
        int[] lps = lps(needle);
        while(first<haystack.length() && second<needle.length()) {
            if(haystack.charAt(first) == needle.charAt(second)) {
                first++;
                second++;
            }
            else {
                if(second==0) {
                    first++;
                }
                else {
                    second=lps[second-1];
                }
            }
        }
        if(second == needle.length()) {
            return first-second;
        } 
        else {
            return -1;
        }
    }
    public static int[] lps(String needle) {
        int[] lps = new int[needle.length()];
        int pref=0, suff=1;
        while(suff<needle.length()) {
            if(needle.charAt(pref) == needle.charAt(suff)) {
                lps[suff]=pref+1;
                pref++;
                suff++;
            }
            else {
                if(pref==0) {
                    lps[suff]=0;
                    suff++;
                }
                else {
                    pref=lps[pref-1];
                }
            }
        }
        return lps;
    }
}