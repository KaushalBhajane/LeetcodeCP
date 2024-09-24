class Solution {
    public String addStrings(String num1, String num2) {
        if(num1.length() > num2.length()) {
            return add(num1, num2);
        }
        else {
            return add(num2, num1);
        }
    }
    public String add(String num1, String num2) {
        int index1 = num1.length()-1, index2 = num2.length()-1;
        int carry = 0, sum = 0;
        StringBuilder ans = new StringBuilder();
        while(index2 >= 0) {
            sum = (num1.charAt(index1) - '0') + (num2.charAt(index2) - '0') + carry;
            carry = sum/10;
            char c = (char) ('0'+(sum%10));
            ans.append(c);
            index1--; 
            index2--;
        }
        while(index1>=0) {
            sum = (num1.charAt(index1) - '0') + carry;
            carry = sum/10;
            char c = (char) ('0'+(sum%10));
            ans.append(c);
            index1--;
        }
        if(carry != 0) {
            ans.append('1');
        }
        return ans.reverse().toString();
    }
}