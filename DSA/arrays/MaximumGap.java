package arrays;
// import java.util.*;

public class MaximumGap {
    // Naive Approach
    // public static int maximumGap(final List<Integer> A) {
    //     int max = Integer.MIN_VALUE;
    //     for(int i = 0; i < A.size(); i++) {
    //         int length = 0;
    //         for(int j = i; j < A.size(); j++) {
    //             if(A.get(j) >= A.get(i) && j >= i) {
    //                 length = Math.max(length, j - i);
    //             }
    //         }
    //         max = Math.max(max, length);
    //     }
    //     return max;
    // }
    // public static int maximumGap(final List<Integer> A) {
    //     int max = Integer.MIN_VALUE;
    //     int[][] arr = new int[A.size()][2];
    //     for(int i = 0; i < A.size(); i++) {
    //         arr[i][0] = A.get(i);
    //         arr[i][1] = i;
    //     }
    // }
    public static int maximumGap(final int[] A) {
        int n=A.length;
        if(n==1)
        return 0;

        //1.Calculate right max of an array

        int rmax[]=new int[n];

        rmax[n-1]=A[n-1];

        for(int i=1;i<n;i++)

        {

            rmax[n-1-i]=Math.max(rmax[n-i],A[n-1-i]);

        }

       

        int x=0;

        int y=0;

        int ans=0;

       

        //2. Check if right max array element is greater than my current element of A then increment the pointer on right max

        // and keep updating the ans.

        //3. When your array(A) element becomes greater than the current right max element than increment the pointer for A.

        // and check if their is a better ans than current max

        while(x<n&&y<n)

        {
            System.out.println(rmax[x]+ " "+ A[y]);
            if(rmax[x]>=A[y])

            {

                ans=Math.max(ans,x-y);

                x++;

            }

            else

            {

                y++;

            }

        }
        return ans;
    }
    public static void main(String[] args) {
        // ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(6,1,2,5,7,0,1,2,3));
        int[] A = {6,1,2,5,7,0,1,2,3};
        System.out.println(maximumGap(A));
    }
}
