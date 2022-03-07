package behavioralPatterns.commandPatternTwo;

public class VolumeUpCommand implements Command {

    private Radio radio;

    public VolumeUpCommand(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void execute() {
        this.radio.volumeUp();
    }
}
