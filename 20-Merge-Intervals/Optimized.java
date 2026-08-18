import java.util.*;

public class Optimized {

    public static int[][] merge(int[][] intervals) {

        // Edge case
        if (intervals.length <= 1) {
            return intervals;
        }

        // Sort by starting value
        Arrays.sort(
            intervals,
            (a, b) -> Integer.compare(a[0], b[0])
        );

        List<int[]> result = new ArrayList<>();

        // First interval
        int start = intervals[0][0];
        int end = intervals[0][1];

        // Process remaining intervals
        for (int i = 1; i < intervals.length; i++) {

            int currentStart = intervals[i][0];
            int currentEnd = intervals[i][1];

            // Overlapping intervals
            if (currentStart <= end) {

                end = Math.max(
                    end,
                    currentEnd
                );

            }

            // Non-overlapping interval
            else {

                result.add(
                    new int[]{start, end}
                );

                start = currentStart;
                end = currentEnd;
            }
        }

        // Add final interval
        result.add(
            new int[]{start, end}
        );

        return result.toArray(
            new int[result.size()][]
        );
    }

    public static void main(String[] args) {

        int[][] intervals = {
            {1, 3},
            {2, 6},
            {8, 10},
            {15, 18}
        };

        int[][] result = merge(intervals);

        for (int[] interval : result) {

            System.out.println(
                "[" +
                interval[0] +
                "," +
                interval[1] +
                "]"
            );
        }
    }
}
