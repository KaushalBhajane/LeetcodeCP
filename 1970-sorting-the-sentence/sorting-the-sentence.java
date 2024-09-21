class Solution {
    public String sortSentence(String s) {
        String[] ans = new String[10];
        int count = 0, index = 0;
        String temp = "";
        while (index < s.length()) {
            if (s.charAt(index) == ' ') {
                int pos = temp.charAt(temp.length() - 1) - '0';
                temp = temp.substring(0, temp.length() - 1);
                ans[pos] = temp;
                temp = "";
                count++;
                
            } else {
                temp += s.charAt(index);
            }
            index++;
        }
        int pos = temp.charAt(temp.length() - 1) - '0';
        temp = temp.substring(0, temp.length() - 1);
        ans[pos] = temp;
        count++;

        StringBuilder result = new StringBuilder();
        for(int i=1; i<=count; i++) {
            result.append(ans[i]).append(" ");
        }
        return result.toString().trim();
    }
}