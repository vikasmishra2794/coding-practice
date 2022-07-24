package bitmasking;

public class NumSetBit {
    public static int numSetBits(int A) {
        int setBitCount = 0;
        while(A > 0) {
            int lastBit = A & 1;
            if(lastBit == 1) {
                setBitCount++;
            }
            A >>= 1;
        }
        return setBitCount;
    }
    public static void main(String[] args) {
        System.out.println(numSetBits(11));
    }
}
