package stack;
import java.util.*;

public class StockSpan {
    public static int[] getStockSpan(int[] arr) {
        Stack<Integer> stack  = new Stack<Integer>();
        int[] output = new int[arr.length];
        output[0] = 1;
        stack.push(0);
        for(int i = 1; i < arr.length; i++) {
            while(!stack.isEmpty() && arr[i] >= arr[stack.peek()]) {
                stack.pop();
            }
            if(stack.isEmpty()) {
                output[i] = i + 1;
            } else {
                output[i] = i - stack.peek();
            }
            stack.push(i);
        }
        return output;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 15, 30};
        System.out.println(Arrays.toString(getStockSpan(arr)));   
    }
}
