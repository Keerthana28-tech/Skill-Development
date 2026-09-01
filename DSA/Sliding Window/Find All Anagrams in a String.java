class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        int n = s.length();
        int m = p.length();

        int left = 0;

        List<Integer> result = new ArrayList<>();

        // Store frequency of characters in p
        for (char ch : p.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Sliding Window
        for (int right = 0; right < n; right++) {

            char ch = s.charAt(right);

            // Add current character to window
            window.put(ch, window.getOrDefault(ch, 0) + 1);

            // When window size becomes m
            if (right - left + 1 == m) {

                // Check whether window is an anagram of p
                if (map.equals(window)) {
                    result.add(left);
                }

                // Remove left character
                char leftChar = s.charAt(left);

                window.put(leftChar, window.get(leftChar) - 1);

                // If frequency becomes 0, remove it
                if (window.get(leftChar) == 0) {
                    window.remove(leftChar);
                }

                left++;
            }
        }

        return result;
    }
}