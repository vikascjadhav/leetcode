class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lofl = new ArrayList<List<Integer>> ();
        for(int i =0; i < nums.length ; i++) {
            if(i>0 && nums[i] == nums[i-1]) //to skip duplicate pair 
                continue;
            
            int target = -nums[i];
            int s = i+1;
            int e = nums.length-1;
            
            while(s<e) {
                if(nums[s]+nums[e]<target) 
                    s++;
                else if(nums[s]+nums[e]>target) {
                    e--;
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[s]);
                    list.add(nums[e]);
                    lofl.add(list);
                    s++;
                    e--;
                    
                    while(s<e & nums[s] == nums[s-1]) s++;
                    while(s<e & nums[e] == nums[e+1]) e--;

                }
            }
            
            
        }
        
        return lofl;
    }
}