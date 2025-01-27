class Solution {
    public String defangIPaddr(String address) {
        int n = address.length();
        String temp = "";
        int index=0;
        while(index < n) {
            if(address.charAt(index) == '.') {
                temp += "[.]";
            }
            else {
                temp += address.charAt(index);
            }
            index++;
        }
        return temp;
    }
}