package stack;
import java.util.*;

public class MinStack {
    Stack<Integer> Stack = new Stack<Integer>();
    int min;
    public void push(int x) {
        if (Stack.isEmpty()) {
            Stack.add(x);
            min = x;
        } else if (x <= min) {
            Stack.add(2 * x - min);
            min = x;
        } else {
            Stack.add(x);
        }
    }

    public void pop() {
        if(!Stack.isEmpty()) {
            int top = Stack.pop();
            if (top <= min) {
                min = 2 * min - top;
            }
        }
    }

    public int top() {
        if(!Stack.isEmpty()) {
            if (Stack.peek() <= min) {
                return min;
            } else {
                return Stack.peek();
            }
        }
        return -1;
    }

    public int getMin() {
        if (!Stack.isEmpty()) {
            return min;
        }
        return -1;
    }
    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.pop();
        ms.push(644643544);
        // ms.push(9);
        System.out.println(ms.getMin());
        System.out.println(ms.top());
        System.out.println(ms.top());
        System.out.println(ms.top());
        // System.out.println(getMin());
        // push(593848644);
        // System.out.println(top());
        // pop();
        // System.out.println(top());
        // System.out.println(top());
        // System.out.println(top());
        // System.out.println(top());
        // pop();
        // push(8);
        // System.out.println(getMin());
        // push(7);
        // System.out.println(getMin());
        // push(6);
        // System.out.println(getMin());
        // pop();
        // System.out.println(getMin());
        // pop();
        // System.out.println(getMin());
        // pop();
        // System.out.println(getMin());
        // pop();
        // System.out.println(getMin());
        // pop();
        // System.out.println(getMin());
    }
}
