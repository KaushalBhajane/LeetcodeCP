class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        s = sortString(s);
        t = sortString(t);
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) != t.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public String sortString(String str) {
        char ch[] = str.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}