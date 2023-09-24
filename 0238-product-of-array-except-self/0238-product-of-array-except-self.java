class Solution {
    public int[] productExceptSelf(int[] nums) {
        int multiply = 1, countZero = 0;
        int[] ans = new int[nums.length];
        for(int n : nums){
            if(n == 0)
            countZero++;
            else
            multiply *= n;
        }
        if(countZero == 0){
            for(int i = 0; i < nums.length; i++){
                ans[i] = multiply / nums[i];
            }
        }
        else if (countZero == 1){
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == 0)
                ans[i] = multiply;

                else
                ans[i] = 0;
            }
        }
        return ans;
    }
}