class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) 
        return false;

        HashMap<Character,Character> mapst = new HashMap<>();
        HashMap<Character,Character> mapts = new HashMap<>();

        for(int i=0;i<s.length();i++) {
            char char_s = s.charAt(i);
            char char_t = t.charAt(i);

            if(mapst.containsKey(char_s) && mapst.get(char_s) != char_t)
            return false;
            if(mapts.containsKey(char_t) && mapts.get(char_t) != char_s)
            return false;

            mapst.put(char_s,char_t);
            mapts.put(char_t,char_s);
        }
        return true;
    }
}