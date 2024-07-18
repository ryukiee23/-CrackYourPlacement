class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 0;
        int count = 1;

        for(int j=1;j<n;j++){
            if(nums[j] == nums[i])
                continue;
            else{
                nums[++i] = nums[j];
                count++;
            }
        }   
        return count;     
    }
}
