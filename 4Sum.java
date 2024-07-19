class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int k = j+1;
                int l = n-1;
                while(k<l){
                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[k];
                    sum += nums[l];
                    if(sum == target){
                        System.out.println(sum);
                        System.out.println(target - nums[l] - nums[k]);
                        ans.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));

                        while(k+1 < l && nums[k] == nums[k+1]) k++;
                        while(l-1 > k && nums[l] == nums[l-1]) l--;

                    k++;
                    l--;
                    }
                    else if(nums[i] + nums[j] + nums[k] + nums[l] > target){
                        l--;
                    }
                    else
                        k++;
                }
            
            while(j+1 < n && nums[j] == nums[j+1]) j++;
            }
        while(i+1 < n && nums[i] == nums[i+1]) i++;
        }
    return ans;
    }
}
