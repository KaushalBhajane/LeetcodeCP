class Solution {
    public boolean isAlphaNumeric(char ch) {
        if(!(ch >= 'A' && ch <= 'Z') && !(ch >= 'a' && ch <= 'z') && !(ch >= '0' && ch <= '9')) {
            return false;
        }
        else {
            return true;
        }
    }
    public void toLowerCase(StringBuilder str) {
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z') {
                char x = Character.toLowerCase(ch);
                str.setCharAt(i, x);
            }
        }
    }
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder(s);
        toLowerCase(str);
        StringBuilder reversedStr = new StringBuilder(str);
        reversedStr.reverse();
        int i=0, j=0, n=s.length();
        while(i < n && j < n) {
            Boolean result1 = isAlphaNumeric(str.charAt(i));
            Boolean result2 = isAlphaNumeric(reversedStr.charAt(j));
            if(result1 == false) {
                i++;
            }
            else if(result2 == false){
                j++;
            }
            else if(str.charAt(i) == reversedStr.charAt(j)) {
                i++;
                j++;
            }
            else {
                return false;
            }
        } 
        return true;
    }
}