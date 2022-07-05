public class MajorityElement {
    public static int majority(int[] A) {
        int num = -1;
        int count = 0;
        int totalCount = 0;
        for(int i = 0; i < A.length; i++) {
            if(num == A[i]) {
                count++;
            } else if(count == 0) {
                num = A[i];
                count = 1;
            } else {
                count--;
            }
        }
        for(int i = 0; i < A.length; i++) {
            if(A[i] == num) {
                totalCount++;
            }
        }
        if (totalCount >= A.length/2 + 1) {
            return num;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] A = {2,1,1};
        System.out.println(majority(A));
    }
}
