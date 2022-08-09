package recursion;

public class Power {
    public static int pow(int A, int B, int C) {
        if(A == 0) {
            return 0;
        }else if(B == 1) {
            return A;
        } else if(B == 0) {
            return 1;
        }
        if(B%2 == 0) {
            return (pow(A, B/2, C)%C * pow(A, B/2, C)%C)%C;
        } else {
            return (A%C * pow(A, B - 1, C)%C)%C;
        }
    }
    public static void main(String[] args) {
        System.out.println(pow(-1, 1, 20));
    }
}
