public class SuperCounter extends Counter{

    int initial_value = 0;

    SuperCounter(int c) {
        super(c);
    }

    public void addN(int n) {
        System.out.println("Juicy ass");
    }

    public static void main(String[] args) {
        SuperCounter c1 = new SuperCounter(0);
        c1.addN(1);
    }

}
