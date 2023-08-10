class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] chars = new int[128];
        int l = 0, r = 0;
        int maxLength = 0;

        for (r = 0; r < s.length(); r++) {
            int rightIndex = s.charAt(r);
            chars[rightIndex]++;   //mark visited
            
            // move left pointer till duplicate char is present
            while (chars[rightIndex] > 1) {
                char leftIndex = s.charAt(l);
                chars[leftIndex]--;  //unvisit
                l++;
            }
            //calculate max
            maxLength = Math.max(maxLength, r - l+1 );
        }
        return maxLength;

    }

}