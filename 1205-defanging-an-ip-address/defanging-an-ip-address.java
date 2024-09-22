class Solution {
    public String defangIPaddr(String address) {
        String temp = "";
        int index = 0;
        while (index < address.length()) {
            if (address.charAt(index) == '.') { // Check characters from address, not temp
                temp += "[.]"; // Add "[.]" when a dot is encountered
            } else {
                temp += address.charAt(index); // Add the current character
            }
            index++;
        }
        return temp;
    }
}
