class Solution {
    public int singleNumber(int[] nums) {
        int res =0;
        for (int i=0 ;i < 32; i++) {
            int sum = 0;
        
            int mask = 0;
            for(int num: nums) {
                mask = 1 << i;
                if( (num & mask) != 0)
                    sum++;
            }    
        
            if(sum%3!=0) {
                res = res | mask;
            }
        }
        return res;
        
    }
}