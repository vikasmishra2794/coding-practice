package stack;

import java.util.Arrays;
import java.util.Stack;

public class NearestSmaller {
    public static int[] nearestSmaller(int[] arr) {
        Stack<Integer> stack = new Stack<Integer>();
        int[] output = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            if(stack.isEmpty()) {
                output[i] = -1;
            } else {
                output[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return output;
    }
    public static void main(String[] args) {
        int[] arr = {1,6,4,12,3,8};
        System.out.println(Arrays.toString(nearestSmaller(arr)));
    }
}
