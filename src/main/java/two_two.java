import java.util.*;
import java.util.logging.Level;

public class two_two {
    static class Node{
        int left;
        int right;
        String res;

        public Node(int left,int right,String res){
            this.left=left;
            this.right=right;
            this.res=res;
        }
    }
    public static void main(String[] args) {
        generateParenthesis(3);

    }

//    //深度遍历
//    public static List<String> generateParenthesis(int n) {
//        List<String> ss = new ArrayList<>();
//        generateParenthesis2(3,3,"",ss);
//        return ss;
//    }
//
//    public static void generateParenthesis2(int left,int right,String s,List<String> res){
//        if(left==0&&right==0)
//        {
//            res.add(s);
//            return;
//        }
//
//        if (left > right) {
//            return;
//        }
//
//        if(left>0){
//            generateParenthesis2(left-1,right,s+"(",res);
//        }
//
//        if(right>0){;
//            generateParenthesis2(left,right-1,s+")",res);
//        }
//
//    }

    //广度遍历
    public static List<String> generateParenthesis(int n){
        List<String> ls = new ArrayList<>();
        if(n==0)
            return ls;
        Queue<Node> que = new ArrayDeque<>();
        Node first = new Node(n, n, "");
        que.add(first);
        //队列为空退出
        while (!que.isEmpty()){
            //将队列的第一个元素取出
            // 1.判断left=right=0，则将字符串加入ls
            //2.判断是否还能左节点和右节点是否有，加入其左右节点到队列
            Node now=que.poll();
            if(now.left== now.right&&now.left==0){
                ls.add(now.res);
                continue;
            }
            else {
                //进行添加左括号
                if(now.left-1>=0&&now.left<=now.right){
                    que.add(new Node(now.left-1, now.right, now.res+"(" ));
                }
                //进行添加右括号
                if(now.right-1>=0&&now.left<= now.right-1){
                    que.add(new Node(now.left, now.right-1, now.res+")" ));
                }
            }
        }

        return ls;
    }
}
