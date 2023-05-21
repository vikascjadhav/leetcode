class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        List<int[]> mergedIntervals = new ArrayList<>();
       // mergedIntervals.add(intervals[0]);

        int mergedInterval [] = intervals[0];

        
        for(int i=1 ; i<intervals.length;i++) {
            int [] interval = intervals[i];

            if(mergedInterval[1] >= interval[0]) {
                mergedInterval[1] = Math.max(interval[1], mergedInterval[1]);
            } else {
                mergedIntervals.add(mergedInterval);
                mergedInterval =interval;
            }

        }
        mergedIntervals.add(mergedInterval);
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}