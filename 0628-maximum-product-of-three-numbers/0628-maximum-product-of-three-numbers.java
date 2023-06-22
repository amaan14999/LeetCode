class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
        int prod = Math.max(nums[0]*nums[1]*nums[len-1],nums[len-1]*nums[len-2]*nums[len-3]);
        return prod;
    }
}