package stack_queue;


import java.util.ArrayDeque;
import java.util.Queue;

//思路
//假设队列已经是栈的结构，此时加入元素如何保证栈结构，即当前加入元素要优先出
//即加入到模拟栈队列的队首
public class queToStack {
    Queue<Integer> toStack = new ArrayDeque<>();
    Queue<Integer> fu = new ArrayDeque<>();


    public queToStack() {

    }

    //压栈
    public void push(int a){
        //1将模拟栈队列转移到辅助队列
        //2将元素入模拟栈
        //3将辅助队列加入模拟栈队列
        //转移走
        while (!this.toStack.isEmpty()){
            this.fu.add(this.toStack.poll());
        }
        //入栈
        this.toStack.add(a);
        //转移回
        while (!this.fu.isEmpty()){
            this.toStack.add(this.fu.poll());
        }

    }
    //弹栈
    public int pop(){
        return this.toStack.poll();
    }

    public boolean isEmpty(){
        return this.toStack.isEmpty();
    }

    public static void main(String[] args) {
        queToStack stack = new queToStack();
        stack.push(9);
        stack.push(8);
        stack.push(7);
        stack.push(6);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }


    }

}
