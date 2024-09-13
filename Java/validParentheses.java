class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(stack.isEmpty() && ((c == ')') || (c == ']') || (c == '}'))){
                return false;
            } else {
                if((c == '(') && (stack.peek() == ')')){
                    stack.pop();
                } else if ((c == '[') && (stack.peek() == ']')){
                    stack.pop();
                } else if ((c == '{') && (stack.peek() == '}')){
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }

        return stack.isEmpty();
    }
}