package commandPattern;

import java.util.List;

public class TurnAllLampsOn implements Command {

    private List<Lamp> lamps;

    public TurnAllLampsOn( List<Lamp> lamps) {
        this.lamps = lamps;
    }

    @Override
    public void execute() {
        lamps.forEach(Lamp::on);
    }
}
