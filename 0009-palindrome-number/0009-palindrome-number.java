class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        
        int count = 0;

        while(temp>0) {
            temp = temp/10;
            count++;
        }
                        
        int tmp = x;
        int reverse =0;
        count--;
        while(count>=0) {                                
           reverse  =  reverse + (tmp%10) * ((int) Math.pow(10,count));
           tmp = tmp/10;
           count--;
        }                     
        return reverse==x;        
    }
}