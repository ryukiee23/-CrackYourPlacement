class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int ans = 0;
        int total = 0;
        int deficit = 0;

        for(int i=0;i<n;i++){
            total += gas[i] - cost[i];
            if(total < 0){
                deficit += total;
                total = 0;
                ans = i+1;
            }
        }

        if(total + deficit >= 0){
            return ans;
        }
        return -1;
    }
}

/*
     i
[3,3,4]
[3,4,4]

--> 3 --> totl = 0  defi = 0  ans = 1
--> 3 --> totl = 0  defi = -1 ans = 2 
--> 4 --> totl = 0  defi = -1 ans = 3


total + deficit >= 0 
return i;

if(deficit < 0) ans++;

 */
