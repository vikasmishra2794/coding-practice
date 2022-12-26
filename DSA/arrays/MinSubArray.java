package arrays;

public class MinSubArray {
    public static int solve(int[] A, int t) {
        int ans = Integer.MAX_VALUE;
        for(int i=0, j=0, sum=0; sum>=t || i <A.length;){
            if(sum<t) {
                sum+=A[i];
                i++;
            }
            else {
                ans=Math.min(ans, i-j);
                sum-=A[j];
                j++;
            }
        }
        return (ans==Integer.MAX_VALUE) ? 0: ans;
    }
    // https://leetcode.com/problems/minimum-size-subarray-sum/discuss/2280388/C%2B%2B-Detailed-Explanation-oror-Two-Pointers-O(n)-and-Binary-Search-O(nlogn)
    // int minSubArrayLen(int target, vector<int>& nums) {
    //     int ans=INT_MAX,j=0,sum=0;
    //     for(int i=0;i<nums.size();i++){
    //         sum+=nums[i];
    //         if(sum>=target){
    //             while(sum>=target){
    //                 ans=min(ans,i-j+1);
    //                 sum=sum-nums[j++];
    //             }
    //         }
    //     }
    //     if(ans==INT_MAX){
    //         return 0;
    //     }
    //     return ans;

    // }
    public static void main(String[] args) {
        int[] A = {2,3,1,2,4,3};
        System.out.println(solve(A, 7));
    }
}
