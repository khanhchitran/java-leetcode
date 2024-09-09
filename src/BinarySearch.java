public class BinarySearch {
    public int search(int[] nums, int target) {
        //Brutal-Force Approach
        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] == target){
        //        return i;
        //     }
        // }
        // return -1;
        //Optimized Approach
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}

