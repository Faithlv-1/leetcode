package stack_queue;

import java.util.Stack;

//思路
//假设模拟队列栈已经是队列，加入元素，怎么将元素放在栈底，
// 即将模拟队列栈内元素转走，元素放入栈底，再将其他元素放回
public class stackToQue {

    Stack<Integer> ToQue = new Stack<>();
    Stack<Integer> fu = new Stack<>();

    public stackToQue() {
    }

    public void add(int a){
        //转移到辅助栈
        while (!this.ToQue.isEmpty()){
            this.fu.push(this.ToQue.pop());
        }
        //压栈
        this.ToQue.push(a);
        //转移回
        while (!this.fu.isEmpty()){
            this.ToQue.push(this.fu.pop());
        }
    }

    public int remove(){
        return this.ToQue.pop();
    }

    public boolean isEmpty(){
        return this.ToQue.isEmpty();
    }


    public static void main(String[] args) {
        stackToQue toQue = new stackToQue();
        toQue.add(1);
        toQue.add(2);
        toQue.add(3);
        toQue.add(4);
        while (!toQue.isEmpty()){
            System.out.println(toQue.remove());
        }
    }
}
