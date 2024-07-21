class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public void solve(int nums[],int idx,List<Integer> v){
        ans.add(new ArrayList<>(v));
        
        for(int i=idx;i<nums.length;i++){
            if(i > idx && nums[i-1] == nums[i])
             continue;

            v.add(nums[i]);
            solve(nums,i+1,v);
            v.remove(Integer.valueOf(nums[i]));
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums);
        solve(nums,0,res);
        return ans;

    }
}
