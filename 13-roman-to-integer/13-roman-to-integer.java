class Solution {
    public int romanToInt(String s) {
        int a = 0;
        s = s.replace("IV","IIII");  
        s = s.replace("IX","VIIII");  
        s = s.replace("XL","XXXX");  
        s = s.replace("XC","LXXXX");  
        s = s.replace("CD","CCCC");  
        s = s.replace("CM","DCCCC"); 
        char s_arr[]=s.toCharArray();
        for(int i = 0;i<s_arr.length;i++){
            switch(s_arr[i]){
                case 'I': a=a+1;
                    break;
                case 'V': a=a+5;
                    break;
                case 'X': a=a+10;
                    break;
                case 'L': a=a+50;
                    break;
                case 'C': a=a+100;
                    break;
                case 'D': a=a+500;
                    break;
                case 'M': a=a+1000;
                    break;    
            }
        }
        return a;
    }
    
}