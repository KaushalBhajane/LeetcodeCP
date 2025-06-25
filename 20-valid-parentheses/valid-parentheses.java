class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            char curr = s.charAt(i);
            if(!stack.isEmpty()) {
                char last = stack.peek();
                if(last=='(' && curr==')' || last=='[' && curr==']' || last=='{' && curr=='}') {
                    stack.pop();
                    continue;
                }
            }
            stack.push(s.charAt(i));
        }
        return stack.isEmpty();
    }
}