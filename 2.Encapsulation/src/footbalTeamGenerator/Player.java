package footbalTeamGenerator;

public class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        this.setName(name);
        this.setEndurance(endurance);
        this.setSprint(sprint);
        this.setDribble(dribble);
        this.setPassing(passing);
        this.setShooting(shooting);
    }

    private void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    private void setEndurance(int endurance) {
        isValidStatsValue(endurance, "Endurance");
        this.endurance = endurance;
    }

    private void setSprint(int sprint) {
        isValidStatsValue(sprint, "Sprint");
        this.sprint = sprint;
    }

    private void setDribble(int dribble) {
        isValidStatsValue(dribble, "Dribble");
        this.dribble = dribble;
    }

    private void setPassing(int passing) {
        isValidStatsValue(passing, "Passing");
        this.passing = passing;
    }

    private void setShooting(int shooting) {
        isValidStatsValue(shooting, "Shooting");
        this.shooting = shooting;
    }

    private void isValidStatsValue(int stat, String statName) {
        if (stat < 0 || stat > 100) {
            throw new IllegalArgumentException(statName + " should be between 0 and 100.");
        }
    }

    public String getName() {
        return name;
    }

    public double overallSkillLevel() {
        return (endurance + sprint + dribble + passing + shooting) / 5.00;
    }


}
