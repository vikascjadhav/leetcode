class Solution {
       public int maxNo(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i])
                max = nums[i];
        }
        return max;
    }

    public int maxBits(int max) {
        int bits = 0;
        while (max > 0) {
            max = max / 2;
            bits++;
        }
        return bits;
    }

    public int findDuplicate(int[] nums) {
        int duplicate = 0;

        int maxBits = maxBits(maxNo(nums));
        int arraySum;
        int numSum;
        for (int i = 0; i < maxBits; i++) {
            int mask = 1 << i;
            arraySum = 0;
            numSum = 0;
            for (int k = 0; k < nums.length; k++) {
                int currentNumber = nums[k];

                if ((mask & currentNumber) > 0) {
                    arraySum++;
                }

                if ((k & mask) > 0) {
                    numSum++;
                }
            }

            //if number of bits are grater than base bits then that bit will be set in duplicate number
            if (arraySum > numSum) {
                duplicate = duplicate | mask;
            }
        }
        return duplicate;
    }
 

}