import java.util.ArrayList;
import java.util.List;

public class one_five_five {
    List<Integer> ls = new ArrayList<>();
    int top=-1;
    int min=0;

    public one_five_five() {

    }

    public void push(int val) {
        if(top==-1)
            this.min=val;
        else if(val<min)
            min=val;
        top++;
        this.ls.add(val);

    }

    public void pop() {
        if(this.ls.get(top)==this.min)
        {
            int temp=this.ls.get(0);
            for (int i = 1; i < this.top; i++) {
                if(temp>this.ls.get(i))
                    temp=this.ls.get(i);
            }
            this.min=temp;
        }
        this.ls.remove(top);
        top--;
    }

    public int top() {
        return ls.get(top);
    }

    public int getMin() {
        return this.min;
    }

    public static void main(String[] args) {
        one_five_five demo = new one_five_five();
        demo.push(-2);
        demo.push(0);
        demo.push(-3);
        demo.getMin();
        demo.pop();
        demo.top();
        demo.getMin();
    }
}
