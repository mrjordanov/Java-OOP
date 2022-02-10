package footbalTeamGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        this.setName(name);
        this.players = new ArrayList<>();
    }

    private void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void removePlayer(String nameOfPlayerToCheck) {
      /*  Player playerToRemove = null;
        for (Player p1 : players) {
            if (p1.getName().equals(player)) {
                playerToRemove = p1;
            }
        }
        if (playerToRemove != null) {
            players.remove(playerToRemove);
        } else {
            System.out.println("Player " + player + " is not in " + name + " team.");
        }*/
        boolean isRemoved=players.removeIf(player->player.getName().equals(nameOfPlayerToCheck));
        if (!isRemoved){
            throw new IllegalArgumentException("Player "+nameOfPlayerToCheck+" is not in "+this.name+" team.");
        }

    }

    public double getRating() {
        // players.stream().mapToDouble(Player::overallSkillLevel).average().orElse(0.00); това също е валиден запис
        return players.stream().map(Player::overallSkillLevel).collect(Collectors.toList())
                .stream().mapToDouble(Double::doubleValue).average().orElse(0.00);

    }
}
