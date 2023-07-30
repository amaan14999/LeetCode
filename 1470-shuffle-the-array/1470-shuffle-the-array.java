class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[2*n];
        int c = 0;
        for(int i=0; i<n; i++)
        {
            ans[c++]= nums[i];
            ans[c++]= nums[i+n];
        }
        return ans;
    }
}