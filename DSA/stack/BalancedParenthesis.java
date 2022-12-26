package stack;

import java.util.Stack;

public class BalancedParenthesis {
    public static int solve(String A) {
        Stack<Character> stack = new Stack<Character>();
        int i = 0;
        while(i < A.length()) {
            if (stack.isEmpty() && (A.charAt(i) == ')' || A.charAt(i) == '}' || A.charAt(i) == ']')) {
                return 0;
            } else if (A.charAt(i) == '(' || A.charAt(i) == '{' || A.charAt(i) == '[') {
                stack.push(A.charAt(i));
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
            i++;
        }
        return stack.isEmpty() ? 1 : 0;
    }
    public static void main(String[] args) {
        System.out.println(solve("))((()(())"));
    }
}
