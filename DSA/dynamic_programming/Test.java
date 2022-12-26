package dynamic_programming;

public class Test {
    static int solution1(int[] numbers, int finalResult) {
        int leftMostIndex = -1;
        int x = 0;
        for(int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                leftMostIndex = i;
                x = numbers[leftMostIndex];
                break;
            }
        }
        if (leftMostIndex == -1) {
            return finalResult;
        }
        for(int i = leftMostIndex; i < numbers.length; i++) {
            if (numbers[i] >= x) {
                numbers[i] = numbers[i] - x;   
            } else {
                break;
            }
        }
        finalResult += x;
        return solution1(numbers, finalResult);
    }
    static int solution(int[] numbers) {
        return solution1(numbers, 0);
    }
    public static void main(String[] args) {
        int[] numbers = {3,3,5,2,3};
        System.out.println(solution(numbers));
    }
}
