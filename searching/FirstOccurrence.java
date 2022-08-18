package searching;

public class FirstOccurrence {
    public static int firstOccurence(int[] A, int B) {
        int i = 0, j = A.length - 1, index = -1;
        while(i <= j) {
            int mid = (i + j)/2;
            if(A[mid] == B) {
                index = mid;
                j = mid - 1;
            } else if (A[mid] <= B) {
                i = mid + 1;
            } else {
                j =  mid - 1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
       int[] A = {2,3,3,4,4,6};
       int B = 4;
       System.out.println(firstOccurence(A, B));
    }
}
