package creationalPatterns.prototypePattern;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Register register = new Register();
        //В регистъра стоят оригиналите, затова ако го принтираме името на дадена книга ще излезе:
        //System.out.println(register.getItem("Book").getName());

        //register.getItem e shallow Clone/Copy, защото при извикване на метода getItem, се клонира и обекта!
        Item clonedBook = register.getItem("Book");

        clonedBook.setName("The hobbit");

        System.out.println(clonedBook.getName());
    }

}
