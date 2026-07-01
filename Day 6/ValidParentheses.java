import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()[]{}";
        
        boolean isValid = true;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    isValid = false;
                    break;
                }
                
                char top = stack.pop();
                if ((c == ')' && top != '(') || 
                    (c == ']' && top != '[') || 
                    (c == '}' && top != '{')) {
                    isValid = false;
                    break;
                }
            }
        }

        if (!stack.isEmpty()) {
            isValid = false;
        }

        System.out.println("Is the bracket sequence valid? " + isValid);
    }
}
