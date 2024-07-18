class Solution {
    public int maxArea(int[] nums) {
        int n = nums.length;
        int ans = 0;

        int s = 0,e = n-1;

        while(s<e){
            int result = Math.min(nums[s],nums[e]);
            result = result * (e-s);
            ans = Math.max(ans,result);

            if(nums[s] < nums[e])
                s++;
            else
                e--;
        }
        return ans;
    }
}
