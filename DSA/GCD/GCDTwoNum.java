package GCD;

public class GCDTwoNum {
    public static int gcd(int num1, int num2) {
        while(num1 != 0) {
            int num_1 = num2%num1;
            int num_2 = num1;
            num1 = num_1;
            num2 = num_2;
        }
        return num2;
    }
    public static int gcdRecursion(int num1, int num2) {
        if(num1 == 0)
            return num2;
        return gcdRecursion(num2%num1, num1);
    }
    public static void main(String[] args) {
        System.out.println(gcdRecursion(10, 4));
    }
}
