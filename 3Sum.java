class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i=0;i<n;i++){
            int s = i+1;
            int e = n-1;
            while(s<e){
            if(nums[i] + nums[s] + nums[e] == 0){
                ans.add(Arrays.asList(nums[i],nums[s],nums[e]));

                while(s+1<e && nums[s] == nums[s+1]) s++;
                while(e-1>s && nums[e] == nums[e-1]) e--;

                s++;
                e--;
            }
            else if(nums[i] + nums[s] + nums[e] > 0){
                e--;
            }
            else
            s++;
            }
        while(i+1<n && nums[i] == nums[i+1]) i++;
        }
        return ans;  
}
}
