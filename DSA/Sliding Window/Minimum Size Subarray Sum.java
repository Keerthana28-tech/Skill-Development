class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minval = Integer.MAX_VALUE;
        int left = 0;
        int currsum = 0;

        for(int right = 0; right < n; right++) {
            currsum += nums[right];
            while(currsum >= target) {
                if(right-left+1 < minval) {
                    minval = right-left+1;
                }
                currsum -= nums[left];
                left++;
            }
        }
        return minval != Integer.MAX_VALUE ? minval : 0;
    }
}