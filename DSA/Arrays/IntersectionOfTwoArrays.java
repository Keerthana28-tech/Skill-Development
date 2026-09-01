
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();

        // Store elements of nums1
        for (int num : nums1) {
            map.put(num, 1);
        }

        // Find common elements
        for (int num : nums2) {
            if (map.containsKey(num)) {
                ans.add(num);
                map.remove(num); // Prevent duplicates
            }
        }

        // Convert ArrayList to int[]
        int[] result = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    }
}