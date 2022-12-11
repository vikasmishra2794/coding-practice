package stack;

import java.util.Stack;

public class RemoveConsecutive {
    public static String solve(String A) {
        Stack<Character> stack = new Stack<Character>();
        StringBuilder s = new StringBuilder();
        stack.push(A.charAt(0));
        for(int i = 1; i < A.length(); i++) {
            if (stack.isEmpty() || stack.peek() != A.charAt(i)) {
                stack.push(A.charAt(i));
            } else {
                stack.pop();
            }
        }
        while(!stack.isEmpty()) {
            s.append(stack.pop());
        }
        return s.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(solve("aaaaa"));
    }
}
