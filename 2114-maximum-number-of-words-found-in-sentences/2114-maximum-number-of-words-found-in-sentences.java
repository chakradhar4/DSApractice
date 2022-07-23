class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int max = (sentences[0].split(" ")).length;
        for(int i = 0;i<sentences.length;i++)
        {
            int n = (sentences[i].split(" ")).length;
            if(n>max){
                max = n;
            }
        }
        return max;
    }
}