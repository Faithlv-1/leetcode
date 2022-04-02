public class seven_nine {
    public static void main(String[] args) {
//        char[][] board={
//                {'A','B','C','E'},
//                {'S','F','C','S'},
//                {'A','D','E','E'},
//        };

        char[][] board={
                {'C','A','A'},
                {'A','A','A'},
                {'B','C','D'},
        };

        String word="AAB";
        exist(board,word);
    }

    public static boolean exist(char[][] board, String word) {
        boolean[] flag = {false};
        int num=0;
        boolean[][] used=new boolean[board.length][board[0].length];
        String now="";

        for(int i=0;i<board.length;i++){
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j]==word.charAt(0)){

                    exist2(board,used,flag,num,i,j,word,now);
                }
                if(flag[0])
                    return flag[0];
            }
        }

        return flag[0];
    }

    //字母数组，字母使用情况，标志，该添加第几个字母，本次添加字母在图中的位置
    public static void exist2(char[][] board,boolean[][] used,boolean[] flag,int num,int row,int col,String word,String now){
        //返回情况
        if(now.equals(word))
        {
            flag[0]=true;
            return;
        }
        //判断请求添加的字母行列是否合理
        else if(row<0||row>=board.length||col<0||col>=board[0].length)
            return;
        //判断是否使用过
        else if(used[row][col]){
            return;
        }
        //判断是否是需要的
        else if(word.charAt(num)!=board[row][col]){
            return;
        }
        //往四个方向走
        now+=board[row][col];
        used[row][col]=true;
        exist2(board,used,flag,num+1,row+1,col,word,now);
        exist2(board,used,flag,num+1,row-1,col,word,now);
        exist2(board,used,flag,num+1,row,col+1,word,now);
        exist2(board,used,flag,num+1,row,col-1,word,now);
        used[row][col]=false;
    }

}
