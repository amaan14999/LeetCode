class Solution {
    public int longestPalindromeSubseq(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        String s2 = sb.toString();

        int i = s.length();
        int j = s2.length();
        int[][] dp = new int[i][j];
        for(int[]row : dp)
        Arrays.fill(row, -1);

        return helper(i - 1, j - 1, s, s2, dp);
    }
    public int helper(int ind1, int ind2, String text1, String text2, int[][]dp){
        if(ind1 < 0 || ind2 < 0)
        return 0;

        if(dp[ind1][ind2] != -1)
        return dp[ind1][ind2];

        if(text1.charAt(ind1) == text2.charAt(ind2))
        return dp[ind1][ind2] = 1 + helper(ind1 - 1, ind2 - 1, text1, text2, dp);

        return dp[ind1][ind2] = Math.max(helper(ind1 - 1, ind2, text1, text2, dp), helper(ind1, ind2 - 1, text1, text2, dp));
    }
}