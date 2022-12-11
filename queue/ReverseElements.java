package queue;
import java.util.*;

public class ReverseElements {
    public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>(A.size());
        for(int data: A) {
            queue.add(data);
        }
        int count = 0;
        while(count < B) {
            stack.push(queue.remove());
            count++;
        }
        while(!stack.isEmpty()) {
            queue.add(stack.peek());
            stack.pop();
        }
        int elementCount = queue.size() - B;
        while(elementCount > 0) {
            int element = queue.remove();
            queue.add(element);
            elementCount--;
        }
        while(!queue.isEmpty()) {
            result.add(queue.poll());
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        int B = 3;
        ArrayList<Integer> result = solve(A, B);
        for(int data: result) {
            System.out.println(data);
        }
    }
}
