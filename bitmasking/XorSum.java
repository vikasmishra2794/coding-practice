package bitmasking;

public class XorSum {
    public static int solve(int[] num) {
        int sum = 0;
        for(int i = 0; i < 31; i++) {
            int zeroCount = 0;
            int oneCount = 0;
            for(int j = 0; j < num.length; j++) {
                // System.out.println(i + " "+ num[j] + " " +(num[j] >> i));
                int setBit = ((num[j] >> i) & 1);
                if(setBit == 1) {
                    oneCount++;
                } else {
                    zeroCount++;
                }
            }
            sum += oneCount * zeroCount * Math.pow(2, i);
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] num = {7,3,5};
        System.out.println(solve(num));
    }
}
