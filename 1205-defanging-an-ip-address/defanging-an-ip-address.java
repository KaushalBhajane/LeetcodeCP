class Solution {
    public String defangIPaddr(String address) {
        String[] str1 = address.split("\\.");
        return String.join("[.]", str1);
    }
}