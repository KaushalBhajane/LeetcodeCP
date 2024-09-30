class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        
        int haystackLength = haystack.length();
        int needleLength = needle.length();
        
        // We only need to check up to haystack.length() - needle.length()
        for (int i = 0; i <= haystackLength - needleLength; i++) {
            // Compare the substring of length `needleLength` starting at `i`
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i; // Return the starting index of the match
            }
        }
        
        return -1; // No match found
    }
}
