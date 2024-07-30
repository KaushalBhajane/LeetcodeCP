class Solution {
    public String removeOccurrences(String s, String part) {
        while(true) {
            int index = s.indexOf(part);
            if(index == -1) {
                break;
            }
            String first = s.substring(0, index);
            String last = s.substring(index+part.length());
            String newStr = first+last;
            s = newStr;
        }
        return s;
    }
}