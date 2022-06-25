class Solution {
    static void reverse(Integer a[])
    {
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
    }
    
    public boolean isPalindrome(int x) {
        int i = x, rev = 0;
        
        if (x < 0) {return false;} // Negative value never palindrome (for 11506th test case)
        
		// Reverses the number
        while(i != 0) {
            int digit = i % 10;
            rev = rev * 10 + digit;
            i /= 10;
        }
        
        if (x == rev) {return true;}
        
        return false;
    }
}