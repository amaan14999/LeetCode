class Solution {
    int[][][] dp;
    public int findMaxForm(String[] strs, int m, int n) {
        dp = new int[m+1][n+1][strs.length];

        return helper(strs, m, n, 0);
    }

    int helper(String[] strs, int zero, int one, int index){
        if(index == strs.length || zero + one == 0)
        return 0;

        if(dp[zero][one][index] > 0){
            return dp[zero][one][index];
        }

        int[] count = count(strs[index]);
        
        int consider = 0;

        if(count[0] <= zero && count[1] <= one){
            consider = 1 + helper(strs, zero - count[0], one - count[1], index + 1);
        }

        int skip = helper(strs, zero, one, index + 1);

        dp[zero][one][index] = Math.max(consider, skip);
        return dp[zero][one][index];
    }
    int[] count(String s){
        int[] count = new int [2];
        for(char c:s.toCharArray()){
            count[c - '0']++;
        }
        return count;
    }
}