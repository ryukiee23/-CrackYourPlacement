class Solution {
    public int solve(int n,int dp[],int idx){
        if(idx > n)
            return 0;
        if(idx == n)
            return 1;
        if(dp[idx] != -1) return dp[idx];
        
        int oneStep = solve(n,dp,idx+1);
        int twoStep = solve(n,dp,idx+2);
        
        return dp[idx] = oneStep+twoStep;
        
    }
    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n,dp,0);
    }
}
              
