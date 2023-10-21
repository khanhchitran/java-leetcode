class MaxSumArray {
    public int maxSumSubarray(int[] nums, int k) {
        int maxSum = 0;
        int windowSum = 0;

        // Sum the first window of size k
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        maxSum = windowSum;

        // Slide the window over the rest of the array
        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k];  // Slide the window
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}
