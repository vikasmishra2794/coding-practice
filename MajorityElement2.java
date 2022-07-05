public class MajorityElement2 {
    public static int majority(int[] A) {
        int num1 = -1;
        int num2 = -1;
        int count1 = 0;
        int count2 = 0;
        int totalCount1 = 0;
        int totalCount2 = 0;
        for(int i = 0; i < A.length; i++) {
            if(num1 == A[i]) {
                count1++;
            } else if(num2 == A[i]) {
                count2++;
            } else if(count1 == 0) {
                num1 = A[i];
                count1 = 1;
            } else if(count2 == 0) {
                num2 = A[i];
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        for(int i = 0; i < A.length; i++) {
            if(A[i] == num1) {
                totalCount1++;
            } else if (A[i] == num2) {
                totalCount2++;
            }
        }
        if (totalCount1 >= A.length/3 + 1 || totalCount2 >= A.length/3 + 1) {
            return totalCount1 >= totalCount2 ? num1 : num2;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 5, 4};
        System.out.println(majority(A));
    }
}
