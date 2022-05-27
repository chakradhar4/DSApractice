class Solution {
    public boolean isValid(String s) {
        int len = s.length();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            char a = s.charAt(i);
            if (a == '(' | a == '{' | a == '[') {
                stack.push(a);
            } else if (!stack.isEmpty()){
                if (a == ')') {
                    if (stack.pop() != '(')
                        return false;
                }   
                if (a == ']') {
                    if (stack.pop() != '[')
                        return false;
                } 
                if (a == '}') {
                    if (stack.pop() != '{')
                        return false;
                }
            }else {
                return false;
            }
        }
        if(!stack.isEmpty()){
            return false;
        }

        return true;
    }
}