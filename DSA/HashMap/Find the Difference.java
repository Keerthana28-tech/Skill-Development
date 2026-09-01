class Solution {
    public char findTheDifference(String s, String t) {
        int charcode = t.charAt(s.length());
        for(int i=0;i<s.length();i++) {
            charcode -= (int) s.charAt(i);
            charcode += (int) s.charAt(i);
        }
        return (char) charcode;
    }
}