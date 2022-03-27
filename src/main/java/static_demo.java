public class static_demo {
    static int num=9;
    public int test(){
        return this.num;
    }
    public static void main(String[] args) {

        static_demo a = new static_demo();
        static_demo b = new static_demo();
        static_demo.num=10;
        System.out.println(a.test());
        System.out.println(b.test());
    }
}
