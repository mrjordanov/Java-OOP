package person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            //Person noName = new Person("  ", "Aimee", 19);
           // Person nullName = new Person(null, "Aimee", 19);
           // Person noLastName = new Person("Franco", "  ", 19);
           // Person nullLastName = new Person("Franco", null, 19);
          //  Person tooYoungPerson = new Person("Franco", "Aimee", -155);
           // Person tooOldPerson = new Person("Franco", "Aimee", 155);*/
            Person person= new Person("Marin","Jordanov", 32);
            System.out.print(person);
        } catch (IllegalArgumentException exception){
            System.out.print("Exception thrown: "+exception.getMessage());
        }

    }
}
