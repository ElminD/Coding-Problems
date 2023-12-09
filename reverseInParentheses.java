String solution(String inputString) {
     Stack<StringBuilder> stack = new Stack<>();
        stack.add(new StringBuilder());
        for (char c : inputString.toCharArray()) {
            if (c == '(') {
                stack.add(new StringBuilder());
            } else if (c == ')') {
                StringBuilder sb = stack.pop().reverse();
                stack.peek().append(sb);
            } else {
                stack.peek().append(c);
            }
        }
    return stack.pop().toString();
}

