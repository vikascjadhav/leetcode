class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int s = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            s = s + nums[i];
           // Calculate the difference s - k to check if a subarray sum of k exists
            int mapValue = map.containsKey(s - k)  ? map.get(s - k) : 0;
            count = count + mapValue;
            if(map.containsKey(s)) {
                map.put(s, map.get(s)+1);
            } else {
                map.put(s, 1);
            }

        }
        return count;
    }
}