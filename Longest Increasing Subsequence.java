class Solution {
    public int solve(int nums[],int idx,int prev,int dp[][]){
        if(idx >= nums.length)
            return 0;
        
        if(dp[idx][prev+1] != -1) return dp[idx][prev+1];

        int take = 0,notTake = 0;
        if(prev == -1 || nums[idx] > nums[prev])
            take = 1 + solve(nums,idx+1,idx,dp);
 
         notTake = solve(nums,idx+1,prev,dp);

        return dp[idx][prev+1] = Math.max(take,notTake);
    }
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int dp[][] = new int[n][n];

        for(int a[]:dp){
            Arrays.fill(a,-1);
        }
        return solve(nums,0,-1,dp);
    }
}
