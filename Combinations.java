class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public void solve(int n,int k,int start,List<Integer> res){
        //base case
        if(res.size() == k){
            ans.add(new ArrayList<>(res));
            return;
        }

        for(int i=start;i<=n;i++){
        res.add(i);
        solve(n,k,i+1,res);
        res.remove(Integer.valueOf(i));
        }

    }
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> res = new ArrayList<>();
        solve(n,k,1,res);
        return ans;
    }
}
