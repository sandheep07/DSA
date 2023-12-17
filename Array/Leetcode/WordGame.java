class WordGame {
    public static boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        boolean res=false;
        int[][] store=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res=fun(board,0,i,j,word);
                if(res==true)return true;
            }
        }
        return false;
    }
    public static boolean fun(char[][] board,int index,int i,int j,String word){
        
        int l=word.length();
        if(index==l)return true;
        int m=board.length;
        int n=board[0].length;
        if(i<0 || i>=m || j<0 || j>=n || board[i][j]!=word.charAt(index))return false;
        
        char ch=board[i][j];
        board[i][j]='#';
        boolean res=fun(board,index+1,i+1,j,word)||
                    fun(board,index+1,i,j+1,word)||
                    fun(board,index+1,i-1,j,word)||
                    fun(board,index+1,i,j-1,word);
        board[i][j]=ch;
        return res;
    }

    public static void main(String[] args) {
       char[][] board={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
       String word="ABCCED";
       System.out.println(exist(board,word));
       
    }
}