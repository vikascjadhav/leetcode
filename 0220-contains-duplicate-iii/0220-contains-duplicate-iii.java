class Solution {
    
    public boolean matched(SortedSet<Integer> set,int num, int valueDiff) {
        
        SortedSet<Integer> subSet = set.subSet(num-valueDiff,num+valueDiff+1);
         if(!subSet.isEmpty())
            return true;
        return false;
    }
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        
        SortedSet<Integer> set = new TreeSet<>();
        
        for(int i=0; i < nums.length; i++) {
         
            if(matched(set,nums[i], valueDiff)) {
                return true;
            }
            
            set.add(nums[i]);
            if(set.size() > indexDiff) {
                set.remove(nums[i-indexDiff]);
            }
        }
        
        return false;
        
    }
}