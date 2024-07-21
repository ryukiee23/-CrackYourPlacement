class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public void solve(int nums[],int idx,int target,List<Integer> res){
        //base case
        if(target == 0){
            ans.add(new ArrayList<>(res));
            return;
        }

        if(target < 0) return;
        
        for(int i=idx;i<nums.length;i++){
            if(i > idx && nums[i] == nums[i-1]) continue;
            if(nums[i] > target) break;
            res.add(nums[i]);
            solve(nums,i+1,target-nums[i],res);
            res.remove(Integer.valueOf(nums[i]));
        }
    }
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();
        solve(nums,0,target,res);
        return ans;
    }
}
/**
[1,1,2,5,6,7,10]
 */
