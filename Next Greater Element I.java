class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        int m = nums1.length;
        int res[] = new int[m];
        Stack<Integer> s = new Stack<>();
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && s.peek() <= nums2[i])
                s.pop();

            if(s.isEmpty())
                map.put(nums2[i],-1);
            else
                map.put(nums2[i],s.peek());
            
            s.push(nums2[i]);
        }

        for(int i=0;i<m;i++){
            res[i] = map.get(nums1[i]);
        }
        return res;
    }
}
