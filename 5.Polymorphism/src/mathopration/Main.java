package mathopration;

public class Main {
    public static void main(String[] args) {
       // MathOperation math = new MathOperation();
        System.out.println(MathOperation.add(2, 2));
        System.out.println(MathOperation.add(3, 3, 3));
        System.out.println(MathOperation.add(4, 4, 4, 4));

        Addable math1 = new Math(2, 2);
        Addable math2 = new Math(3, 3, 3);
        Addable math3 = new Math(4, 4, 4, 4);

        System.out.println(add(math1));
        System.out.println(add(math2));
        System.out.println(add(math3));

    }

    public static int add(Addable addable) {
      return addable.add();
    }
}
