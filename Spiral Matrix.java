class Solution {
    public List<Integer> spiralOrder(int[][] nums) {
        int n = nums.length;
        int m = nums[0].length;
        int left = 0,right = m-1;
        int top = 0,bottom = n-1;

        List<Integer> ans = new ArrayList<>();

        while(top <= bottom && left <= right){
            
            for(int i=left;i<=right;i++){
                ans.add(nums[top][i]);
            }
            top++;

            for(int i=top;i<=bottom;i++){
                ans.add(nums[i][right]);
            }
            right--;

            if(top <= bottom){
            for(int i=right;i>=left;i--){
                ans.add(nums[bottom][i]);
            }
            bottom--;
            }

            if(left <= right){
            for(int i=bottom;i>=top;i--){
                ans.add(nums[i][left]);
            }
            left++;
            }

        }
        return ans;
    }
}
