class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int i =0;
        int j = 0;
        int k = n-1;

        while(i<=k){
            if(nums[i] == 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
                j++;
            }
            else if(nums[i] == 1){
                i++;
            }
            else{
                int temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
                k--;
            }
        }
    }
}



