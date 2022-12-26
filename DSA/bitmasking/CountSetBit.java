package bitmasking;

public class CountSetBit {
    public static int solve(int A) {
        long count = 0;
        for(int i = 0; i < 32; i++) {
            for(int j = 1; j <= A; j++) {
                if((j & 1 << i) > 0) {
                    count = (count % 1000000007) + 1;
                }
            }
        }
        int result = (int)count;
        return result;
    }
    public static void main(String[] args) {
        System.out.println(solve(3));
    }
}
