import java.util.*;

public class BruteForce {

    public static int[][] merge(int[][] intervals) {

        boolean[] merged = new boolean[intervals.length];

        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {

            if (merged[i]) {
                continue;
            }

            int start = intervals[i][0];
            int end = intervals[i][1];

            boolean changed = true;

            while (changed) {

                changed = false;

                for (int j = 0; j < intervals.length; j++) {

                    if (merged[j] || i == j) {
                        continue;
                    }

                    // Check overlap
                    if (intervals[j][0] <= end
                            && intervals[j][1] >= start) {

                        start = Math.min(
                            start,
                            intervals[j][0]
                        );

                        end = Math.max(
                            end,
                            intervals[j][1]
                        );

                        merged[j] = true;

                        changed = true;
                    }
                }
            }

            result.add(new int[]{start, end});
        }

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
