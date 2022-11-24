class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length()==t.length()){
            LinkedHashMap<Character, Character> smap=new LinkedHashMap();
            LinkedHashMap<Character, Character> tmap=new LinkedHashMap();
            for(int i=0;i<s.length();i++){
                if(!smap.containsKey(s.charAt(i))) smap.put(s.charAt(i),t.charAt(i));
                if(!tmap.containsKey(t.charAt(i))) tmap.put(t.charAt(i),s.charAt(i));
            }
            for(int i=0;i<t.length();i++){
                if(tmap.get(t.charAt(i)) != s.charAt(i) || smap.get(s.charAt(i)) != t.charAt(i)) return false;
            }       
        }
        else return false;
        
        return true;
    }
}