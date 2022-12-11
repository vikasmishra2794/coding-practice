package arrays;
import java.util.*;
class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}
public class MergeTest {
    public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        if (newInterval.start > newInterval.end) {
            int temp = newInterval.start;
            newInterval.start = newInterval.end;
            newInterval.end = temp;
        }
        intervals.add(newInterval);
        Collections.sort(intervals, new Comparator<Interval>(){
            public int compare(Interval o1, Interval o2)
            {
               return o1.start < o2.start ? -1 : 1;
            }
          });
        int i = 0;
        while(i < intervals.size()) {
            if (i < intervals.size() - 1 && intervals.get(i).end >= intervals.get(i + 1).start) {
                intervals.get(i).end = intervals.get(i + 1).end;
                intervals.remove(i+1);
            } else {
                i++;
            }
        }
        return intervals;
    }
    public static void main(String[] args) {
        ArrayList<Interval> intervals = new ArrayList<Interval>();
        ArrayList<Interval> result = new ArrayList<Interval>();
        Interval i1 = new Interval(1,3);
        Interval i2 = new Interval(6,9);
        intervals.add(i1);
        intervals.add(i2);
        Interval newInterval = new Interval(2,6);
        result = insert(intervals, newInterval);
        System.out.println(result);
    }    
}
