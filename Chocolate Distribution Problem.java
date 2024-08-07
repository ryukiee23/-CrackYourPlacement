class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);
        int ans = Integer.MAX_VALUE;
        
        for(int i=0;i<(n-m+1);i++){
            int diff = a.get(i+m-1) - a.get(i);
            ans = Math.min(diff,ans);
        }
        return ans;
    }
}
