package example;

public class Main {
    public static void main(String[] args) {



        Button lampButton = new Button(new Lamp());
        Button radioButton = new Button(new Radio());

        lampButton.pushTheButton();
        lampButton.pushTheButton();
        radioButton.pushTheButton();
        radioButton.pushTheButton();
        radioButton.pushTheButton();

    }


}
