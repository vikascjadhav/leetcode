class Solution {
    
   public String gcdOfStrings(String str1, String str2) {
       // switch strings based on length
        if (str2.length() > str1.length()) {
            return gcdOfStrings(str2, str1);
        }
        //if strings are equal then retun
        if (str1.equals(str2)) {
            return str1;
        }
        // checl if longer string starts with short string
        if(str1.startsWith(str2)) {
            return gcdOfStrings(str1.substring(str2.length()), str2);
        }
        return "";
    }

}