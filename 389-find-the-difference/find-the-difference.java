class Solution {
    public char findTheDifference(String s, String t) {
        if(s.length()==0) {
            return t.charAt(0);
        }
        char c = 0;
        for(char ch:s.toCharArray()) {
            c^=ch;
        }
        for(char ch:t.toCharArray()) {
            c^=ch;
        }
        return c;

    }
}