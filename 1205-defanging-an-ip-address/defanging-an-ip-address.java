class Solution {
    public String defangIPaddr(String address) {
        String[] digits = address.split("\\.");
        return String.join("[.]", digits);
    }
}