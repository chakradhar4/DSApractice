import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        boolean a;
        char[] sTemp = s.toCharArray();
         Arrays.sort(sTemp);
        char[] tTemp = t.toCharArray();
        Arrays.sort(tTemp);
        a = Arrays.equals(sTemp,tTemp);
       return a;     
    }
}