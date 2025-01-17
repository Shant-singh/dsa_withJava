package stack;

import java.util.Stack;

public class validParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char cur = s.charAt(i);
            if(cur == '(' || cur == '{' || cur == '['){
                stack.push(cur);
            } else {
                if(stack.empty())
                    return false;

                char top = stack.pop();
                if (cur == ')' && top != '(')
                    return false;
                else if(cur == ']' && top != '[')
                    return false;
                else if(cur == '}' && top != '{')
                    return false;
            }
        }

        return stack.empty();
    }
}
