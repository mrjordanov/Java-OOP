package military;

public class Mission {

    private String name;
    private State state;


    public Mission(String name, String state) {
        this.name = name;
        this.state = State.valueOf(state);
    }

    public String getName() {
        return name;
    }

    public State getState() {
        return state;
    }

    @Override
    public String toString() {
        return "  Code Name: "+name+" State: "+state;
    }
}
