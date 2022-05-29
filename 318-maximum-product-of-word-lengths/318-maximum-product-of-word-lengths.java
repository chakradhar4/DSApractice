class Solution {
    public int maxProduct(String[] words) {
        int[][] charset = new int[words.length][26];

    for(int i = 0; i< words.length;i++){
        for(int j = 0; j<words[i].length();j++){
            charset[i][words[i].charAt(j)-'a']++;
        }
    }
    
    int length = Integer.MIN_VALUE;
    for(int i = 0; i< words.length;i++){
        for(int j = i+1; j<words.length;j++){
            if(isok(i, j, charset))
                length = Math.max(length, words[i].length()*words[j].length());
        }
    }
    
    return length < 0? 0:length;
}

public boolean isok(int i, int j, int[][] charset){
    for(int k = 0; k<26;k++){
        if(charset[i][k] > 0 && charset[j][k] > 0) return false;
    }
    return true;

    }
}