public class ConcatenateThreeNumbers {
    public static int concatenateNumber(int A, int B, int C) {
        return (((A * 100) + B) * 100) + C;
    }
    public static int minimumNumber(int A, int B, int C) {
        int startsWithA = Math.min(concatenateNumber(A, B, C), concatenateNumber(A, C, B));
        int startsWithB = Math.min(concatenateNumber(B, A, C), concatenateNumber(B, C, A));
        int startsWithC = Math.min(concatenateNumber(C, A, B), concatenateNumber(C, B, A));
        return Math.min(Math.min(startsWithA, startsWithB), startsWithC);
    }
    public static void main(String[] args) {
        System.out.println(minimumNumber(55,43,47));
    }
}
