package stack;
import java.util.Stack;

public class BalancedParen2 {
    public static int solve(String A) {
        Stack<Character> stack = new Stack<Character>();
        int i = 0;
        while(i < A.length()) {
            char value = A.charAt(i);
            if (stack.isEmpty() && (value == ')' || value == '}' || value == ']')) {
                return 0;
            } else if (A.charAt(i) == '(' || A.charAt(i) == '{' || A.charAt(i) == '[') {
                stack.push(A.charAt(i));
            } else if (!stack.isEmpty() && ((value == ')' && stack.peek() == '(') || (value == '}' && stack.peek() == '{') || (value == ']' && stack.peek() == '['))) {
                stack.pop();
            }
            i++;
        }
        return stack.isEmpty() ? 1 : 0;
    }
    public static void main(String[] args) {
        System.out.println(solve("({})"));
    }
}
