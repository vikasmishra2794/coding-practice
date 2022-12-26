package practice_problems.arrays;

public class GreaterElements {
    public static int getCount(int[] arr) {
        int count = 0, max = Integer.MIN_VALUE;
        for(int data: arr) {
            if (max < data) {
                max = data;
                count = 1;
            } else if (max == data) {
                count++;
            }
        }
        return arr.length - count;
    }
    public static void main(String[] args) {
        int[] arr = {-3, 2, 5, 8, 10, 6, 7, 8, 10, 10, -2};
        System.out.println(getCount(arr));
    }
}
