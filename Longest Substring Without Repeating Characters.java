class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        Map<Character,Integer> m = new HashMap<>();

        int i = 0 ,j = 0;
        while(j<n){
            m.put(s.charAt(j),m.getOrDefault(s.charAt(j),0) + 1);
            
            if(m.size() == j-i+1){
                ans = Math.max(ans,j-i+1);
            }

            while(m.size() != j-i+1){
                m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0) - 1);

                if(m.get(s.charAt(i)) == 0)
                    m.remove(s.charAt(i));
                i++;
            }
            j++;
        }
        return ans;
    }
}
