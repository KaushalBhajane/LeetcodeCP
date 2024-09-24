class Solution {
    public String sortVowels(String s) {
        int[] lower = new int[26];
        int[] upper = new int[26];
        StringBuilder str = new StringBuilder(s);
        for(int i=0; i<s.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                int index = ch - 'a';
                lower[index]++;
                str.setCharAt(i, '#');
            }
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                int index = ch - 'A';
                upper[index]++;
                str.setCharAt(i, '#');
            }
        }
        StringBuilder vowels = new StringBuilder();
        for(int i=0; i<26; i++) {
            char ch = (char) ('A' + i);
            while(upper[i] > 0) {
                vowels.append(ch);
                upper[i]--;
            }
        }
        for(int i=0; i<26; i++) {
            char ch = (char) ('a' + i);
            while(lower[i] > 0) {
                vowels.append(ch);
                lower[i]--;
            }
        }
        int index = 0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == '#') {
                str.setCharAt(i, vowels.charAt(index));
                index++;
            }
        }
        return str.toString();
    }
}