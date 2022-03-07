package behavioralPatterns.commandPatternTwo;

public class Controller {

    private Command command;


    public void executeCommand(Command command) {
        this.command = command;
        command.execute();
    }
}
