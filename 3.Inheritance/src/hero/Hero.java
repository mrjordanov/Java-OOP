package hero;

import java.util.Locale;

public class Hero {
    private String username;
    private int level;

    public Hero(String username, int level) {
        this.username = username;
        this.level = level;
    }


    public String getUsername() {
        return username;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        String className=getClass().getName().substring(0, 1).toUpperCase(Locale.ROOT) + getClass().getName().substring(1);
        return String.format("Type: %s Username: %s Level: %s", className, getUsername(), getLevel());
    }
}
