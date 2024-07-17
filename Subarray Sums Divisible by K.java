class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        Map<Integer,Integer> m = new HashMap<>();
        int sum = 0,ans = 0;
        m.put(0,1);

        for(int i =0;i<n;i++){
            sum += nums[i];
            int rem = sum % k;
            if(rem < 0)
            rem = rem + k;

            if(m.containsKey(rem) == true){
                ans += m.get(rem);
                m.put(rem,m.get(rem) + 1);
            }
            else
            m.put(rem,1);
        }
        return ans;

    }
}
