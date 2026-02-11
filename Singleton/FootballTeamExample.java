package Singleton;

import java.util.ArrayList;
import java.util.List;

class FootballTeam {
    private static FootballTeam instance;

    private List<String> players;
    private String coach;

    private FootballTeam() {
        players = new ArrayList<>();
        coach = "Inconnu";
    }

    public static FootballTeam getInstance() {
        if (instance == null) {
            instance = new FootballTeam();
        }
        return instance;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public String getCoach() {
        return coach;
    }

    public void addPlayer(String player) {
        players.add(player);
    }

    public List<String> getPlayers() {
        return players;
    }
}

public class FootballTeamExample {
    public static void main(String[] args) {
        // Récupérer l'instance unique
        FootballTeam team1 = FootballTeam.getInstance();
        FootballTeam team2 = FootballTeam.getInstance();

        team1.addPlayer("Messi");
        team1.addPlayer("Ronaldo");

        team2.addPlayer("Neymar");

        team2.setCoach("Guardiola");

        System.out.println("Coach: " + team1.getCoach());
        System.out.println("Joueurs: " + team1.getPlayers());
    }
}
