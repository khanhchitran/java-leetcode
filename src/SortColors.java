public class SortColors {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int i = 0;
        
        // Loop till i is less than or equal to high
        while (i <= high) {
            if (nums[i] == 0) {
                // Swap nums[i] with nums[low]
                nums[i] = nums[low];
                nums[low] = 0;
                low++;
                i++;  // Increment i after processing
            } else if (nums[i] == 2) {
                // Swap nums[i] with nums[high]
                nums[i] = nums[high];
                nums[high] = 2;
                high--;
                // Do not increment i, need to check the swapped element at i
            } else {
                // If nums[i] is 1, just move to the next element
                i++;
            }
        }
    }
}
 