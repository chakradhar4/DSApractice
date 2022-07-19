class Solution{

public String longestCommonPrefix(String[] strs) {
    // get the first string
    String first = strs[0];
	// default the prefix is full length
    int prefixLen = first.length();
	// iterate all strings
    for (int i = 1; i < strs.length; i++) {
		// if the string shorter than prefix length, prefix lengh would only possible equal and smaller than that
        if (strs[i].length() < prefixLen)
            prefixLen = strs[i].length();
		// exam the characters, if not matched, shorter the prefix length
        for (int j = 0; j < prefixLen; j++) {
            if (first.charAt(j) != strs[i].charAt(j)) {
                prefixLen = j;
                break;
            }
        }
        if (prefixLen == 0)
            return "";
    }
    
    return first.substring(0, prefixLen);
}
}