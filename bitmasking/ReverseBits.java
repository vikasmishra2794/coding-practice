package bitmasking;

public class ReverseBits {
    public static int reverse(int num) {
        int result = 0;
        for(int i = 1; i <= 32; i++) {
            int last_bit = num & 1;
            result += last_bit * 1<<(32 - i);
            num >>= 1;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(reverse(1));
    }
}
