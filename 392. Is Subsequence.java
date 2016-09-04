public class Solution {
    public boolean isSubsequence(String s, String t) {
        int lenS = s.length();
        int lenT = t.length();
        if(lenS > lenT) {
            return false;
        }
        int j = 0;
        char now;
        for(int i = 0; i < lenS; i++) {
            now = s.charAt(i);
            while(j < lenT && now != t.charAt(j)){
                j++;
            }
            if(j == lenT) {
                return false;
            }
            else {
                j++;
            }
        }
        return true;
    }
}