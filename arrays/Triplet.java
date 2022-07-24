package arrays;
import java.util.*;

public class Triplet {
    public static List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        // ArrayList<List<Integer>> result1 = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    result.add(new ArrayList<Integer>(Arrays.asList(nums[i], nums[j], nums[k])));
                    k--;
                    while(j < k && nums[k] == nums[k + 1]) k--;
                } else if (nums[i] + nums[j] + nums[k] > 0) {
                    k--;
                } else if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                }
            }
        }
        // result = new ArrayList < List < Integer >> (new LinkedHashSet < List < Integer >> (result));
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {-2,0,0,2,2};
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        result = threeSum(nums);
        for(List<Integer> data: result) {
            for(int d: data) {
                System.out.print(d+" ");
            }
            System.out.println();
        }
    }
}
