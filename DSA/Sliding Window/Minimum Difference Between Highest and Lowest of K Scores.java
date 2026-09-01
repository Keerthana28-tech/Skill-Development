class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int min = Integer.MAX_VALUE;
        for(int right = 0; right < nums.length; right++) {
            if(right - left + 1 == k) {
                int diff = nums[right] - nums[left];
                min = Math.min(min , diff);
                left++;
            }
        }
        return min;
    }
}