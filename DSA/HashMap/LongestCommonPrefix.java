class Solution {
    public String longestCommonPrefix(String[] strs) {

        // Loop through each character of the first string
        for (int i = 0; i < strs[0].length(); i++) {

            // Compare with all other strings
            for (int j = 1; j < strs.length; j++) {

                // If current string is shorter
                // OR characters don't match
                if (i == strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }

        // If no mismatch is found, the first string is the common prefix
        return strs[0];
    }
}