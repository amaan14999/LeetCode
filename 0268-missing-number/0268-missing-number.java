class Solution {
    public int missingNumber(int[] nums) {
        int len=nums.length;
        int gsum=(len*(len+1))/2;
        for(int i=0;i<len;i++)
        {
            gsum-=nums[i];
        }
        return gsum;
    }
}