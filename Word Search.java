class Solution {
    public boolean solve(char board[][],String word,int i,int j,int n,int m,int idx){
        if(i >= n || i < 0 || j >= m || j < 0)
            return false;
        if(board[i][j] != word.charAt(idx)) 
            return false;
        if(board[i][j] == '#')
            return false;

        if(idx == word.length() - 1)
            return true;
            
        char temp = board[i][j];
        
        board[i][j] = '#';

        boolean ans = (solve(board,word,i+1,j,n,m,idx+1) || 
                      solve(board,word,i,j-1,n,m,idx+1) ||
                      solve(board,word,i-1,j,n,m,idx+1) ||
                      solve(board,word,i,j+1,n,m,idx+1));
        
        board[i][j] = temp;
                      
        return ans;

    }
    public boolean exist(char[][] board, String word) {
        int l = word.length();
        int n = board.length;
        int m = board[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(word.charAt(0) == board[i][j]){
                    if(solve(board,word,i,j,n,m,0) == true)
                        return true;
                }
            }
        }
        return false;
    }
}
