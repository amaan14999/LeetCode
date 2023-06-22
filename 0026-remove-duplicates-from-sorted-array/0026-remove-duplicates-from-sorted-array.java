class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=1;
        int len=nums.length;
        while(j<len)
        {
            if(nums[j]==nums[i])
            {
                j++;
            }
            else
            {
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}