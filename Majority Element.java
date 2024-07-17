class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int major = 0;
        int count = 0;

        for(int i=0;i<n;i++){
            if(count == 0){
                major = nums[i];
                count++;
                continue;
            }

            if(major == nums[i])
            count++;
            else
            count--;
        }
        return major;
    }
}
