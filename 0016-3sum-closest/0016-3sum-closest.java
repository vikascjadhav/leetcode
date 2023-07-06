class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int sum = nums[0]+nums[1]+nums[n-1] ;
        int diff = Math.abs((sum- target));
        int res = sum;
        
        for(int i=0; i < n-2; i++) {
            int s=i+1, e=n-1;
            
            while(s<e) {
                
                sum = nums[s]+nums[e]+nums[i];
                diff = Math.abs(sum - target);
                if(sum <target)                     
                    s++;
                else if(sum > target) 
                    e--;
                else {
                    return sum;
                }
                
                if(diff < Math.abs(res-target)) 
                    res = sum;
            }
        }
        
        return res;
        
    }
}