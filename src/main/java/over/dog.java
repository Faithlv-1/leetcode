package over;

public class dog extends animal{
    final String name="dog";
    public void eat(){
        System.out.println(name+"  eat");
    }
    public void sleep(){
        System.out.println(name+"  sleep");
    }

    public static void main(String[] args) {

        dog Dog2 = new dog();
        Dog2.eat();
    }
}
