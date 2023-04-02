package Grind75.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {
    public static void main(String[] args) {

        int[][] intervals=  {{1,3},{6,9}}; //{{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval=  {2,5};
        System.out.println(Arrays.deepToString(insertInterval(intervals,newInterval)));
    }

    public static int[][] insertInterval(int[][] intervals, int[] newInterval) {

        List<int[]> list=new ArrayList<>();
        int i=0;

        while((i< intervals.length) && (intervals[i][1] < newInterval[0]))
            list.add(intervals[i++]);

        while((i<intervals.length) && (intervals[i][0]<=newInterval[1])){
            newInterval[0]= Math.min(intervals[i][0],newInterval[1]);
            newInterval[1]= Math.max(intervals[i][1],newInterval[0]);
            i++;
        }

        return list.toArray(new int[list.size()][]);

    }
}
