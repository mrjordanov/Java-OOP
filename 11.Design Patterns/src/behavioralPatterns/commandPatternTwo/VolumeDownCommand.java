package behavioralPatterns.commandPatternTwo;

public class VolumeDownCommand implements Command{

    private Radio radio;

    public VolumeDownCommand(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void execute() {
        this.radio.volumeDown();
    }
}
