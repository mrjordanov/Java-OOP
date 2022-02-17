package mathopration;

public class Math implements Addable {

    private int a;
    private int b;
    private int c;
    private int d;

    public Math(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Math(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public Math(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public int add() {
        return a + b + c + d;
    }
}
