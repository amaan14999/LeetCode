class Solution {
    // public boolean isMonotonic(int[] nums) {
    //    return isInc(nums) || isDec(nums); 
    // }
    // public boolean isInc(int[] nums){
    //     for(int i = 1; i < nums.length; i++){
    //         if(nums[i] < nums[i - 1])
    //         return false;
    //     }
    //     return true;
    // }
    // public boolean isDec(int[] nums){
    //     for(int i = 1; i < nums.length; i++){
    //         if(nums[i] > nums[i - 1])
    //         return false;
    //     }
    //     return true;
    // }

    public boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                increasing = false;
            }
            if (nums[i] < nums[i + 1]) {
                decreasing = false;
            }
        }

        return increasing || decreasing;
    }
}