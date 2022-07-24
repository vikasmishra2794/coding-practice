package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        int i = 0;
        ArrayList<int[]> result = new ArrayList<int[]>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        while(i < intervals.length) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            while(i + 1 < intervals.length && end >= intervals[i + 1][0]) {
                end = Math.max(end, intervals[i + 1][1]);
                i++;
            }
            result.add(new int[]{start, end});
            i++;
        }
        return result.toArray(new int[0][]);
    }
    public static void main(String[] args) {
        int[][] intervals = {{1,4},{2,3}};
        int[][] result = new int[intervals.length][2];
        result = merge(intervals);
        System.out.println(Arrays.deepToString(result));
    }
}
