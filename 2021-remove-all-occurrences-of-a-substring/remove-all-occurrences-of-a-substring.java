class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder newStr = new StringBuilder(s);
        while(newStr.indexOf(part) != -1 ) {
            int index = newStr.indexOf(part);
            newStr.delete(index, index+part.length());
        }
        return newStr.toString();
    }
}