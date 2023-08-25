class Solution {
    private Integer[][] dp;

    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        dp = new Integer[n][n];
        return helper(0, 0, triangle);
    }

    private int helper(int i, int j, List<List<Integer>> triangle) {
        // Check if out of bounds of the triangle
        if(i >= triangle.size() || j >= triangle.get(i).size())
        return Integer.MAX_VALUE;

        // If at the last row, return the value at the current cell
        if(i == triangle.size() - 1)
        return triangle.get(i).get(j);

        // Check if the result for the current cell is already computed
        if(dp[i][j] != null)
        return dp[i][j];

        int down = triangle.get(i).get(j) + helper(i + 1, j, triangle);
        int diagonal = triangle.get(i).get(j) + helper(i + 1, j+1, triangle);

        return dp[i][j] = Math.min(down, diagonal);
    }
}