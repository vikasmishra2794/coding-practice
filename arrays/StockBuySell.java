package arrays;

public class StockBuySell {
    public static int buyAndSell(int[] A) {
        int profit = 0;
        for(int i = 1; i < A.length; i++) {
            if(A[i] > A[i - 1]) {
                profit += A[i] - A[i - 1];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] A = {4,2,2,2,4};
        System.out.println(buyAndSell(A));
    }
}
