class Solution {
    public int maxScore(int[] nums, int k) {
        int n = nums.length;
        int ans = 0,sum = 0;

        for(int i=0;i<k;i++){
            sum += nums[i];
        }

        ans = Math.max(ans,sum);

        for(int i=k-1;i>=0;i--){
            sum = sum - nums[i];
            sum = sum + nums[n-k+i];
            ans = Math.max(ans,sum);
        }
        return ans;
    }
}
