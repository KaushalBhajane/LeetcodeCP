class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] alpha = new int[26];
        for(int i=0; i<sentence.length(); i++) {
            int index = sentence.charAt(i) - 'a';
            alpha[index] = 1;
        }
        for(int i=0; i<26; i++) {
            if(alpha[i] == 0) {
                return false;
            }
        }
        return true;
    }
}