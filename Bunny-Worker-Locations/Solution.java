public class Solution {
    public static String solution(long x, long y) {
        long result = 1;
        for(int i = 1; i < y ; i++){
            result += i;
        }
        long y_level = 1+ y;
        for(int i = 1; i < x ; i++){
            result += y_level;
            y_level++;
        }
        
        return Long.toString(result);   
    }
    
}
