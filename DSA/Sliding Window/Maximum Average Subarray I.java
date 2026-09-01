class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double sum = 0;
        
        // Step 1: First window
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        
        double maxSum = sum;
        
        // Step 2: Slide the window
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, sum);
        }
        
        // Step 3: Return average
        return maxSum / k;
    }
}
