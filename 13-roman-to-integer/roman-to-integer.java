class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> RomanData = new HashMap<>();
        RomanData.put('I', 1);
        RomanData.put('V', 5);
        RomanData.put('X', 10);
        RomanData.put('L', 50);
        RomanData.put('C', 100);
        RomanData.put('D', 500);
        RomanData.put('M', 1000);
        int sum = 0, index = 0;
        while(index < s.length()-1) {
            if(RomanData.get(s.charAt(index)) < RomanData.get(s.charAt(index+1))) {
                sum -= RomanData.get(s.charAt(index));
            }
            else {
                sum += RomanData.get(s.charAt(index));
            }
            index++;
        }
        sum += RomanData.get(s.charAt(s.length()-1));
        return sum;
    }
}