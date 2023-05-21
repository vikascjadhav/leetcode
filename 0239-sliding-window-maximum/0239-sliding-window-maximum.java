class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int res[] = new int[nums.length - k + 1];

        Deque<Integer> q = new ArrayDeque<>();

        int i = 0;
        int ri = 0;
        while (i < nums.length) {

            if (!q.isEmpty() && q.peek() == i - k) {
                q.poll();
            }

            while (!q.isEmpty() && nums[q.peekLast()] < nums[i]) {
                q.pollLast();
            }

            q.offer(i);
            if (i >= k - 1) {
                // peek not remove
                res[ri++] = nums[q.peek()];
                
            }
            i++;
        }

        return res;
    }
}