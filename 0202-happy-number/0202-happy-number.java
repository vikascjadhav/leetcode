class Solution {
    public int sq(int num) {
        int result = 0 ;
        int rem = 0;
        while ( num>0 ) {
            rem = num %10;
            
            result = result + rem*rem;
            num = num/10;
            
        }
        
        return result;
    }
    public boolean isHappy(int n) {
        
        int slow = n;
        int fast = n;
        
        // here slow and fast pointer 
        // fast is calculating square two time to move two steps ahead
        // in any case fast and slow will meet
        do {
            slow = sq(slow);
            fast = sq(sq(fast));
        } while(slow!=fast);
        // do while as initially fast and slow are same
        
        if(slow == 1) 
         return true;
        else 
         return false;
                
    }
}