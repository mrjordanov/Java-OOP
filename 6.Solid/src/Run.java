public class Run {
    public static void main(String[] args) {

        Money income = new Money(55,"USD");
        Money expenses= new Money(55,"USD");
        Money money= new Money(50,"USD");
        System.out.println(income.equals(money));
        System.out.println(income.equals(expenses));
        System.out.println(income.hashCode());
        System.out.println(expenses.hashCode());
        System.out.println(money.hashCode());
    }
}
