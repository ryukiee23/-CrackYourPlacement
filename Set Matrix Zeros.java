class Solution {
    public void setZeroes(int[][] nums) {
        int n = nums.length;
        int m = nums[0].length;
        int col0 = 1;
        // int row[] = new int[n];
        // int col[] = new int[m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(nums[i][j] == 0){
                    nums[i][0] = 0;

                    if(j != 0){
                    nums[0][j] = 0;
                    }
                    else
                      col0 = 0;
                    //  row[i] = 1;
                    // col[j] = 1;
                }
            }
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(nums[i][0] == 0 || nums[0][j] == 0){
                    nums[i][j] = 0;
                }
            }
        }

        if(nums[0][0] == 0){
            for(int j=0;j<m;j++)
            nums[0][j] = 0;
        }

        if(col0 == 0){
            for(int i=0;i<n;i++)
            nums[i][0] = 0;
        }
    }
}
