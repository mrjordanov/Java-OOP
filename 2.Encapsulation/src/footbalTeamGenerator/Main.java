package footbalTeamGenerator;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arg = scanner.nextLine();
      
        Map<String, Team> teamMap = new LinkedHashMap<>();

        while (!arg.equals("END")) {
            String command = arg.split(";")[0];

            if (command.equals("Team")) {
                String teamName = arg.split(";")[1];
                try {
                    Team team = new Team(teamName);
                    teamMap.putIfAbsent(teamName, team);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }

            if (command.equals("Add")) {
                String teamName = arg.split(";")[1];
                String playerName = arg.split(";")[2];
                int endurance = Integer.parseInt(arg.split(";")[3]);
                int sprint = Integer.parseInt(arg.split(";")[4]);
                int dribble = Integer.parseInt(arg.split(";")[5]);
                int passing = Integer.parseInt(arg.split(";")[6]);
                int shooting = Integer.parseInt(arg.split(";")[7]);
                if (!teamMap.containsKey(teamName)) {
                    System.out.println("Team " + teamName + " does not exist.");
                } else {
                    try {
                        Player player = new Player(playerName, endurance, sprint, dribble, passing, shooting);
                        teamMap.get(teamName).addPlayer(player);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }

            if (command.equals("Remove")) {
                String teamName = arg.split(";")[1];
                String playerName = arg.split(";")[2];
                teamMap.get(teamName).removePlayer(playerName);
            }
            if (command.equals("Rating")) {
                String teamName = arg.split(";")[1];
                if (!teamMap.containsKey(teamName)) {
                    System.out.println("Team " + teamName + " does not exist.");
                } else {
                    double rating = teamMap.get(teamName).getRating();
                    long rounded = Math.round(rating);
                    System.out.printf("%s - %d", teamName, rounded).println();
                }
            }
            arg = scanner.nextLine();
        }

    }
}
