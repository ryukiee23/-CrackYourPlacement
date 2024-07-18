class Solution {
    public int[] nextSmaller(int nums[],int first[]){
        int n = nums.length;
        Stack<Integer> s = new Stack<>();

        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && nums[s.peek()] >= nums[i]){
                s.pop();
            }
            if(s.isEmpty()){
                first[i] = n;
            }
            else
                first[i] = s.peek();
            s.push(i);
        }
        return first;
    }

     public int[] prevSmaller(int nums[],int second[]){
        int n = nums.length;
        Stack<Integer> s = new Stack<>();

        for(int i=0;i<n;i++){
            while(!s.isEmpty() && nums[s.peek()] >= nums[i]){
                s.pop();
            }
            if(s.isEmpty()){
                second[i] = -1;
            }
            else
                second[i] = s.peek();
            s.push(i);
        }
        return second;
    }

    public int largestRectangleArea(int[] nums) {
        int n = nums.length;

        int first[] = new int[n];
        int second[] = new int[n];
        int ans = Integer.MIN_VALUE;

        first = nextSmaller(nums,first);
        second = prevSmaller(nums,second);

        for(int i=0;i<n;i++){
            int area1 = nums[i] * (first[i] - i);
            int area2 = nums[i] * (i - second[i]);

            int area = area1 + area2;
            area = area-nums[i];
            ans = Math.max(area,ans);
        }
        return ans;         
    }
}
