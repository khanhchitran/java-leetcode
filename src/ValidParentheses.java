import java.util.Stack;

public class ValidParentheses {
    class Solution {
    public boolean isValid(String s) {
        // Stack to keep track of opening brackets
        Stack<Character> stack = new Stack<>();
        
        // Loop through each character in the string
        for (char c : s.toCharArray()) {
            // If it's an opening bracket, push it onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            // If it's a closing bracket, check if it matches the top of the stack
            else {
                // If stack is empty, return false (no corresponding opening bracket)
                if (stack.isEmpty()) {
                    return false;
                }
                
                // Pop the top of the stack and check if it matches the closing bracket
                char top = stack.pop();
                if (c == ')' && top != '(') {
                    return false;
                }
                if (c == '}' && top != '{') {
                    return false;
                }
                if (c == ']' && top != '[') {
                    return false;
                }
            }
        }
        
        // If the stack is empty at the end, the string is valid, otherwise it's invalid
        return stack.isEmpty();
    }
}
}
